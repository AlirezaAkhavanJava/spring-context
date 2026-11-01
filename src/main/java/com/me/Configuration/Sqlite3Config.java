package com.me.Configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@Profile("test")
public class Sqlite3Config {

    @Bean(name = "sqlite3Datasource")
    public DataSource dataSource() {
        HikariDataSource hDs = new HikariDataSource();
        hDs.setJdbcUrl("jdbc:sqlite:SpringOnly.db");
        return hDs;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
