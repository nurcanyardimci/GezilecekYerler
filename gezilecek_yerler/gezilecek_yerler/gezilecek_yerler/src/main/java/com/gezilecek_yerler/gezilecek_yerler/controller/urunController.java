package com.gezilecek_yerler.gezilecek_yerler.controller;

import com.gezilecek_yerler.gezilecek_yerler.model.urun;
import com.gezilecek_yerler.gezilecek_yerler.repo.urunRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="/urun/")
public class urunController {
    urunRepo urunRepository;
    @GetMapping(path = "getAll")
    public ResponseEntity<List<urun>> getAll() {
        return new ResponseEntity<>(urunRepository.getAll(), HttpStatus.OK);
    }
}
