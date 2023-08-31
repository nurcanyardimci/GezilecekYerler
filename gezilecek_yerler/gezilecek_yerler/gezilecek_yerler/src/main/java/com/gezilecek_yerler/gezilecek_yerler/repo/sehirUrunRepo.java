package com.gezilecek_yerler.gezilecek_yerler.repo;

import com.gezilecek_yerler.gezilecek_yerler.model.sehirUrun;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository

public class sehirUrunRepo {
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<sehirUrun> getAllById(String name) {
        return namedParameterJdbcTemplate.query(
                "SELECT * FROM public.sehir INNER JOIN  public.urun on public.sehir.sehir_plaka=public.urun.plaka_kodu WHERE public.sehir.sehir_adi=:name",
                new MapSqlParameterSource("name", name),
                (rs, rowNum) ->
                        new sehirUrun(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getInt(3),
                                rs.getString(4),
                                rs.getInt(5),
                                rs.getString(6),
                                rs.getString(7),
                                rs.getInt(8)
                               )
        );
    }
}