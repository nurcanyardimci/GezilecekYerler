package com.gezilecek_yerler.gezilecek_yerler.repo;

import com.gezilecek_yerler.gezilecek_yerler.model.restorant;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Repository

public class restorantRepo {
        private JdbcTemplate jdbcTemplate;

        public List<restorant>getAll(){
            List<restorant>restorantt=new ArrayList<>();
            String sql= "SELECT * FROM public.restorant";
            RowMapper<restorant>rowMapper= new RowMapper<restorant>() {
                @Override
                public restorant mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return new restorant(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getString(4) );

                }
            };
            restorantt=jdbcTemplate.query(sql,rowMapper);
            return restorantt;
        }
}

