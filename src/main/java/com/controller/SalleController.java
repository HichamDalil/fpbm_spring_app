package com.controller;

import com.entities.Salle;
import com.services.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Salle")
public class SalleController {
    @Autowired
    private SalleService salleService;
    @GetMapping()
    public List<Salle> fetchAllSalle(){
        return salleService.fetchAll();
    }

    @GetMapping("/{id}")
    public Salle fetchOneSalle(@PathVariable(name = "id") Long id){
        return salleService.fetchOne(id);
    }

    @PostMapping()
    public Salle saveSalle(@RequestBody Salle salle){
        return salleService.save(salle);
    }

    @PutMapping("/{id}")
    public Salle updateEquipe(@RequestBody Salle salle, @PathVariable(name = "id") Long id){
        return salleService.update(salle,id);
    }

    @DeleteMapping("/{id}")
    public String deleteSalle(@PathVariable(name = "id") Long id){
        salleService.delete(id);
        return "Deleted Successfully.................";
    }
}