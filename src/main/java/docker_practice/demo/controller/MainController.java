package docker_practice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String firstGet() {
        String name = "seung";
        int age = 20;
        return name + " is " + age + " years old";
    }

}