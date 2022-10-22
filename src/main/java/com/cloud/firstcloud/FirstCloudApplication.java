package com.cloud.firstcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FirstCloudApplication {

    @Autowired
    private EmploeeRepository emploeeRepository;

    @PostMapping("/employ")
    public Emploee addEmploee(@RequestBody Emploee emploee) {
        return emploeeRepository.save(emploee);
    }


    @GetMapping("/employes")
    public List<Emploee> getEmploees() {
        return emploeeRepository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstCloudApplication.class, args);
    }

}
