package scrib.hyde.rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scrib.hyde.data.interfaces.RamenCSVResourceInterface;

import javax.annotation.Resource;

@RestController
public class RamenCSVControllers {

    @Resource
    RamenCSVResourceInterface ramenCSVInterface;

    @RequestMapping("/")
    public String testHello() {
        return "Hello Greetings !!!" + ramenCSVInterface.getAllRamens().size();
    }

}
