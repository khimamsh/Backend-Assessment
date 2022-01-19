package com.nivahata.locationapp;

import com.nivahata.locationapp.Repos.LocationRepo;
import com.nivahata.locationapp.model.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
@CrossOrigin
@RestController
public class ElasticSearchApp {
    @Autowired
    private LocationRepo repo;

    @PostMapping("/save")
    public void save(@RequestBody Location location)
    {
        repo.save(location);
    }

    @GetMapping("/getAll")
    public Iterable<Location> getAll() {
        return repo.findAll();
    }

    @PutMapping("/removeAll")
    public void removeAll()
    {
        repo.deleteAll();
    }
    
   public static void main(String[] args) {
        SpringApplication.run(ElasticSearchApp.class, args);
    }
}
