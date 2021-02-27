package scrib.hyde.rest.spring;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import scrib.hyde.data.spring.DataSpring;

@Configuration
@ComponentScan(basePackages = {"scrib.hyde.rest"})
@EnableAutoConfiguration
@Import({DataSpring.class})
public class RestSpring {

}
