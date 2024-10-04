package com.roquet.code.pruebatecnica;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.roquet.code.pruebatecnica.repository") // Escanea el paquete donde están los mappers
public class PruebaTecnicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebaTecnicaApplication.class, args);
    }
}
