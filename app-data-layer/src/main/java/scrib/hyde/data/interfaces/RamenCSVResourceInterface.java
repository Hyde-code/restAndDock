package scrib.hyde.data.interfaces;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import scrib.hyde.data.modelbuilder.RamenCSVResourceBuilder;
import scrib.hyde.models.pojo.RamenModelLayer;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Component
public class RamenCSVResourceInterface {
    @Resource
    RamenCSVResourceBuilder ramenCSVResource;

    public List<RamenModelLayer> getAllRamens() {
        return ramenCSVResource.getRamensList();
    }

}
