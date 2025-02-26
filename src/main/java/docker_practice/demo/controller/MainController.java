package docker_practice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainController {

    @GetMapping("/")
    public Map<String, Object> firstGet() {
        return Map.of("name", "first", "age", 30);
    }


    @GetMapping("/api/")
    public Map<String, Object> secondGet() {
        String name = "seung";
        int age = 20;
        return Map.of("name", "second", "age", age);
    }

    @GetMapping("/cd/")
    public Map<String, Object> thirdGet() {
        return Map.of("name", "third", "age", 20);
    }

}