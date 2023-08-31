package com.gezilecek_yerler.gezilecek_yerler.repo;

import com.gezilecek_yerler.gezilecek_yerler.model.sehir;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Repository

public class sehirRepo {
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<sehir>getAll(){
        List<sehir>sehirr=new ArrayList<>();
        String sql= "SELECT * FROM public.sehir";
        RowMapper<sehir>rowMapper= new RowMapper<sehir>() {
            @Override
            public sehir mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new sehir(rs.getInt(1), rs.getString(2),rs.getInt(3),rs.getString(4) );

            }
        };
        sehirr=jdbcTemplate.query(sql,rowMapper);
        return sehirr;
    }
}
