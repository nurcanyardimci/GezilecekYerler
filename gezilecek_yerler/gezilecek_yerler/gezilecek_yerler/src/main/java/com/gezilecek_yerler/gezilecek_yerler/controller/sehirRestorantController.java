package com.gezilecek_yerler.gezilecek_yerler.controller;

import com.gezilecek_yerler.gezilecek_yerler.model.sehirRestorant;
import com.gezilecek_yerler.gezilecek_yerler.repo.sehirRestorantRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="/sehirRestorant/")
@CrossOrigin
public class sehirRestorantController {
    sehirRestorantRepo ssehirRestorantRepo;
    @GetMapping(path = "getAll/{name}")
    public ResponseEntity<List<sehirRestorant>>getbyname(@PathVariable(name = "name") String name){
        return new ResponseEntity<>(ssehirRestorantRepo.getAllById(name), HttpStatus.OK);

    }
}
