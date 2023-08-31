package com.gezilecek_yerler.gezilecek_yerler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class restorant {
    private int id;
    private int plaka_kodu;
    private String restorant_Adi;
    private String fotograf_restorant;

}
