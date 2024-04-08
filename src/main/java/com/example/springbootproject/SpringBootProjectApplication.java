package com.example.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootProjectApplication.class, args);
    }

    @GetMapping("/Foundation")
    public String getFoundation() {


        return ("The modules offered by the Foundation Program are : <br>"
                + "CSC 111F <br>"
                + "CSC 121F ");
    }
    @GetMapping("/Undergraduate")
    public String getUndergraduate(){

        return (
                "The modules offered by the Undergraduate Program are : <br>"
                        + "CSC 111 <br>"
                        +"CSC 211 <br>"
                        +"CSC 212 <br>"
                        +"CSC 221<br>"
                        +"CSC 224");
    }
    @GetMapping("/Honours")
    public String getHonours() {

        return ("The modules offered by the Honours Program are : <br>"
                + "CSC 511 <br>"
                + "CSC 512 <br>"
                + "CSC 513 <br>"
                + "CSC 514 <br>"
                + "CSC 515");
    }
}