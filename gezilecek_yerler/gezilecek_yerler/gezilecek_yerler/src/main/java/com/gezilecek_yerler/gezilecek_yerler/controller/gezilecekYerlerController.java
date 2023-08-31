package com.gezilecek_yerler.gezilecek_yerler.controller;

import com.gezilecek_yerler.gezilecek_yerler.model.gezilecekYerler;
import com.gezilecek_yerler.gezilecek_yerler.repo.gezilecekYerlerRepo;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="/gezilecekYerler/")
public class gezilecekYerlerController {
    gezilecekYerlerRepo gezilecekYerlerRepository;
    @GetMapping(path="getAll")
    public ResponseEntity<List<gezilecekYerler>>getAll(){
        return new ResponseEntity<>(gezilecekYerlerRepository.getAll(),HttpStatus.OK);

    }
}
