package scrib.hyde.rest.spring;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.filter.ShallowEtagHeaderFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.Filter;
import java.io.File;
import java.util.List;

@Configuration
public class WebApplicationConfiguration extends WebMvcAutoConfiguration {
    /*
    Note to self: @EnableWebMV auto enables WebMvcAutoConfiguration which causes a bean duplication error
    exclude: exclude = {WebMvcAutoConfiguration.class}
     */
    @Bean
    public Filter eTagFilter() {
        return new ShallowEtagHeaderFilter();
    }


}
