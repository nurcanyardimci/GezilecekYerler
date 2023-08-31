package com.gezilecek_yerler.gezilecek_yerler.repo;

import com.gezilecek_yerler.gezilecek_yerler.model.gezilecekYerler;
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
public class gezilecekYerlerRepo {
    private JdbcTemplate jdbcTemplate;

    public List<gezilecekYerler>getAll(){
        List<gezilecekYerler>gezilecek_yerler=new ArrayList<>();
        String sql= "SELECT * FROM public.gezilecek_yerler";
        RowMapper<gezilecekYerler>rowMapper= new RowMapper<gezilecekYerler>() {
            @Override
            public gezilecekYerler mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new gezilecekYerler(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getString(4) ,rs.getString(5));

            }
        };
        gezilecek_yerler=jdbcTemplate.query(sql,rowMapper);
        return gezilecek_yerler;
    }
}
