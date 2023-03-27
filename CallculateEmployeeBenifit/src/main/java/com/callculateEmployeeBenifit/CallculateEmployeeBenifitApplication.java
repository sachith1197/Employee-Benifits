package com.callculateEmployeeBenifit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CallculateEmployeeBenifitApplication {

    public static void main(String[] args) {
        SpringApplication.run(CallculateEmployeeBenifitApplication.class, args);
    }

   @GetMapping("/welcome")
    public String welcome(){
        return"Welcome to Employee benifits portal";
   }

}
