package com.gezilecek_yerler.gezilecek_yerler.repo;

import com.gezilecek_yerler.gezilecek_yerler.model.sehirGezilecekYerler;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
public class sehirGezilecekYerlerRepo {
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<sehirGezilecekYerler> getAllById(String name) {
        return namedParameterJdbcTemplate.query(
                "SELECT * FROM public.sehir INNER JOIN  public.gezilecek_yerler on public.sehir.sehir_plaka=public.gezilecek_yerler.plaka_kodu WHERE public.sehir.sehir_adi=:name",
                new MapSqlParameterSource("name", name),
                (rs, rowNum) ->
                        new sehirGezilecekYerler(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getInt(3),
                                rs.getString(4),
                                rs.getInt(5),
                                rs.getInt(6),
                                rs.getString(7),
                                rs.getString(8),
                                rs.getString(9)
                        )
        );
    }
}
