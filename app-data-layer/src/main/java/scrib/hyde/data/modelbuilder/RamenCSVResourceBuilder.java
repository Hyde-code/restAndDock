package scrib.hyde.data.modelbuilder;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.MethodInvocationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import scrib.hyde.data.spring.YamlConfigs;
import scrib.hyde.models.pojo.RamenModelLayer;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class RamenCSVResourceBuilder {

    private static final String CLASS_PATH_CSV_FILE_PATH = "data/ramen-ratings.csv";

    @Getter
    private List<RamenModelLayer> ramensList;

    @Autowired
    private YamlConfigs configs;

    private void loadRamensFromClassPath() {
        var classLoader = getClass().getClassLoader();
        //var csvFile = new File(classLoader.getResource(CLASS_PATH_CSV_FILE_PATH).getFile());
        var csvFile = new File(configs.getCsvFilePath());
        ramensList = new ArrayList<>();

        try {
            ramensList = new CsvToBeanBuilder(new FileReader(csvFile))
                    .withType(RamenModelLayer.class)

                    .build()
                    .parse();

        } catch (FileNotFoundException e) {
            log.error("Could not load ramen data from CSV in class path");
            e.printStackTrace();
        }
    }

    private void transformModelList() {
        this.ramensList.forEach(m -> {
            try {
                m.setStarsDoubleVal(Double.parseDouble(m.getStars()));
            } catch (Exception e) {
                m.setStarsDoubleVal(0d);
            }
        });
    }

    @PostConstruct
    public void loadRamens() throws IOException, CsvException {
        loadRamensFromClassPath();
        transformModelList();
    }
}
