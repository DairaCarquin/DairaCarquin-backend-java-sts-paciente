package com.example.demo.util;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseValidator implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        // Consulta para obtener el nombre de todas las tablas en la base de datos
        String query = "SELECT table_name FROM information_schema.tables WHERE table_schema = 'Admision' AND table_type = 'BASE TABLE'";
        
        // Ejecutar la consulta y recuperar los nombres de las tablas
        List<String> tables = jdbcTemplate.queryForList(query, String.class);
        
        // Imprimir los nombres de las tablas
        System.out.println("Tablas en la base de datos:");
        for (String tableName : tables) {
            System.out.println(tableName);
        }
    }
}
