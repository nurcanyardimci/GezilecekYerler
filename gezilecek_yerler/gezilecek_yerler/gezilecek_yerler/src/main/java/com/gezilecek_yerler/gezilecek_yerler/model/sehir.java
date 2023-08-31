package com.gezilecek_yerler.gezilecek_yerler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class sehir {
    private int id;
    private String sehir_adi;
    private int sehir_plaka;
    private String sehirAdiTurkce;
}

