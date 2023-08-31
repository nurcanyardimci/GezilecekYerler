package com.gezilecek_yerler.gezilecek_yerler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class sehirUrun {
    private int id;
    private String sehir_adi;
    private int sehir_plaka;
    private String sehirAdiTurkce;
    private int id_urun;
    private String urun_fotograf;
    private String urun_baslik;
    private int plaka_kodu;

}
