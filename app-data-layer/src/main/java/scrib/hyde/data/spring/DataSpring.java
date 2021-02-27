package scrib.hyde.data.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"scrib.hyde.data"})
@EnableAutoConfiguration
public class DataSpring {
    private static Logger log = LogManager.getLogger("DataSpring");
}
