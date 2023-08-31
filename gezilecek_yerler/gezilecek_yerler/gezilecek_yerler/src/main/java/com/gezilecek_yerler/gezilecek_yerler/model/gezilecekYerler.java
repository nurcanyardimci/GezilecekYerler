package com.gezilecek_yerler.gezilecek_yerler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class gezilecekYerler {
    private int id;
    private int plaka_kodu;
    private String fotograf_gezilecek;
    private String baslik;
    private String aciklama;
}
