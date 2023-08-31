package com.gezilecek_yerler.gezilecek_yerler.controller;

import com.gezilecek_yerler.gezilecek_yerler.model.sehir;
import com.gezilecek_yerler.gezilecek_yerler.repo.sehirRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="/sehir/")
public class sehirController {
    sehirRepo sehirRepository;
    @GetMapping(path = "getAll")
    public ResponseEntity<List<sehir>> getAll() {
        return new ResponseEntity<>(sehirRepository.getAll(), HttpStatus.OK);
    }
}
