package furb.blue.beaver.project.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/status")
    public Map checkStatus() {
        return Map.of(
                "status", "UP",
                "framework", "Spring Boot",
                "javaVersion", System.getProperty("java.version")
        );
    }

}
