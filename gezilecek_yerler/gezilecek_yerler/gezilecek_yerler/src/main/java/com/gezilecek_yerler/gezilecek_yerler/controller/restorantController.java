package com.gezilecek_yerler.gezilecek_yerler.controller;

import com.gezilecek_yerler.gezilecek_yerler.model.restorant;
import com.gezilecek_yerler.gezilecek_yerler.repo.restorantRepo;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="/restorant/")
public class restorantController {
    restorantRepo restorantRepository;
    @GetMapping(path = "getAll")
    public ResponseEntity<List<restorant>> getAll() {
        return new ResponseEntity<>(restorantRepository.getAll(), HttpStatus.OK);
    }
}