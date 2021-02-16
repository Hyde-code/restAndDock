package scrib.hyde.data.spring;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"scrib.hyde.data"})
@EnableAutoConfiguration

public class DataSpring implements CommandLineRunner {
    private static Logger log = LogManager.getLogger("DataSpring");


    @Override
    public void run(String... args) throws Exception {
        log.info("Spring Boot Completed");
    }
}
