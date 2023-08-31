package com.gezilecek_yerler.gezilecek_yerler.controller;

import com.gezilecek_yerler.gezilecek_yerler.model.sehirUrun;
import com.gezilecek_yerler.gezilecek_yerler.repo.sehirUrunRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="/sehirUrun/")
@CrossOrigin
public class sehirUrunController {
    sehirUrunRepo ssehirUrunRepo;
    @GetMapping(path = "getAll/{name}")
    public ResponseEntity<List<sehirUrun>>getbyname(@PathVariable(name = "name") String name){
        return new ResponseEntity<>(ssehirUrunRepo.getAllById(name), HttpStatus.OK);

    }
}
