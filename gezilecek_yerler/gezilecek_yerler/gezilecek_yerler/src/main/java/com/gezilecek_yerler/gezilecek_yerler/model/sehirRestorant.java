package com.gezilecek_yerler.gezilecek_yerler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class sehirRestorant {
    private int id;
    private String sehir_adi;
    private int sehir_plaka;
    private String sehirAdiTurkce;
    private int id_restorant;
    private int plaka_kodu;
    private String restorant_Adi;
    private String fotograf_restorant;
}
