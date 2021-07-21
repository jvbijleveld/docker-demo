package nl.vanbijleveld.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World, I'm version 4!  And now quickly updating....";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
