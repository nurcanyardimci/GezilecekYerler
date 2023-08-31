package com.gezilecek_yerler.gezilecek_yerler.controller;
import com.gezilecek_yerler.gezilecek_yerler.model.sehirGezilecekYerler;
import com.gezilecek_yerler.gezilecek_yerler.repo.sehirGezilecekYerlerRepo;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="/sehirGezilecekYerler/")
@CrossOrigin
public class sehirGezilecekYerlerController {
    sehirGezilecekYerlerRepo ssehirGezilecekYerlerRepo;
    @GetMapping(path = "getAll/{name}")
    public ResponseEntity<List<sehirGezilecekYerler>>getbyname(@PathVariable(name = "name") String name){
        return new ResponseEntity<>(ssehirGezilecekYerlerRepo.getAllById(name), HttpStatus.OK);

    }
}
