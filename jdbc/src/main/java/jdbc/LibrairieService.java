package jdbc;

import generation.tables.pojos.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LibrairieService {

    private static final Logger logger = LogManager.getLogger("LoggingAspect");

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> findLivre() {
        return jdbcTemplate.query("select * from livre", new livreRowMapper());
    }

    private class livreRowMapper implements org.springframework.jdbc.core.RowMapper<String> {


        @Override
        public String mapRow(ResultSet rs, int rowNum) throws SQLException {
            int numOfCols = rs.getMetaData().getColumnCount();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i <= numOfCols; i++) {
                stringBuilder
                        .append(rs.getMetaData().getColumnName(i))
                        .append(" : ").append(rs.getObject(i))
                        .append(", ");
            }
            return stringBuilder.toString();
        }
    }


    public Object findLivre2() {
        return jdbcTemplate.query("select * from livre", new LivreResultExtractor());
    }

    private class LivreResultExtractor implements ResultSetExtractor<Map<Integer, String>> {


        @Override
        public Map<Integer, String> extractData(ResultSet rs) throws SQLException, DataAccessException {
            Map<Integer, String> map = new HashMap<>();
            int rownum = 0;
            while (rs.next()) {
                rownum++;
                int numOfCols = rs.getMetaData().getColumnCount();
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 1; i <= numOfCols; i++) {
                    stringBuilder
                            .append(rs.getMetaData().getColumnName(i))
                            .append(" : ").append(rs.getObject(i))
                            .append(", ");
                }
                map.put(rownum, stringBuilder.toString());
            }
            return map;
        }
    }

    public List<Livre> findLivre3() {
        return jdbcTemplate.query("select * from livre", new BeanRowMapper());
    }

    private class BeanRowMapper implements org.springframework.jdbc.core.RowMapper<Livre> {


        @Override
        public Livre mapRow(ResultSet rs, int rowNum) throws SQLException {
            Livre livre = (new BeanPropertyRowMapper<>(Livre.class)).mapRow(rs, rowNum);
            return livre;
        }
    }
}
