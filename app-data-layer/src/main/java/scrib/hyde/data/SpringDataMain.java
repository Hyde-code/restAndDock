package scrib.hyde.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import scrib.hyde.data.spring.DataSpring;

public class SpringDataMain {
    public static void main(String[] args) {
        SpringApplication.run(DataSpring.class, args);
    }
}
