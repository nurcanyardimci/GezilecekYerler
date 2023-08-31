package com.gezilecek_yerler.gezilecek_yerler.repo;

import com.gezilecek_yerler.gezilecek_yerler.model.urun;
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
public class urunRepo {
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<urun>getAll(){
        List<urun>urunn=new ArrayList<>();
        String sql= "SELECT * FROM public.urun";
        RowMapper<urun>rowMapper= new RowMapper<urun>() {
            @Override
            public urun mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new urun(rs.getInt(1), rs.getString(2),rs.getString(3) );

            }
        };
        urunn=jdbcTemplate.query(sql,rowMapper);
        return urunn;
    }
}
