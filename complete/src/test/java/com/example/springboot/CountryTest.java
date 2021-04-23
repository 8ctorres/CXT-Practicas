package com.example.springboot;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
public class CountryTest{

    @Autowired
    private MockMvc mockMvc;

    private final String expectedJson = "[{\"id\":1,\"name\":\"Alemania\",\"capital\":\"Berlín\"},{\"id\":2,\"name\":\"Austria\",\"capital\":\"Viena\"},{\"id\":3,\"name\":\"Bélgica\",\"capital\":\"Bruselas\"},{\"id\":4,\"name\":\"Bulgaria\",\"capital\":\"Sofía\"},{\"id\":5,\"name\":\"Chipre\",\"capital\":\"Nicosia\"},{\"id\":6,\"name\":\"Croacia\",\"capital\":\"Zagreb\"},{\"id\":7,\"name\":\"Dinamarca\",\"capital\":\"Copenhague\"},{\"id\":8,\"name\":\"Eslovaquia\",\"capital\":\"Bratislava\"},{\"id\":9,\"name\":\"Eslovenia\",\"capital\":\"Luibliana\"},{\"id\":10,\"name\":\"España\",\"capital\":\"Madrid\"},{\"id\":11,\"name\":\"Estonia\",\"capital\":\"Tallín\"},{\"id\":12,\"name\":\"Finlandia\",\"capital\":\"Helsinki\"},{\"id\":13,\"name\":\"Francia\",\"capital\":\"París\"},{\"id\":14,\"name\":\"Grecia\",\"capital\":\"Atenas\"},{\"id\":15,\"name\":\"Hungría\",\"capital\":\"Budapest\"},{\"id\":16,\"name\":\"Irlanda\",\"capital\":\"Dublín\"},{\"id\":17,\"name\":\"Italia\",\"capital\":\"Roma\"},{\"id\":18,\"name\":\"Letonia\",\"capital\":\"Riga\"},{\"id\":19,\"name\":\"Lituania\",\"capital\":\"Vilna\"},{\"id\":20,\"name\":\"Luxemburgo\",\"capital\":\"Luxemburgo\"},{\"id\":21,\"name\":\"Malta\",\"capital\":\"La Valeta\"},{\"id\":22,\"name\":\"Países Bajos\",\"capital\":\"Ámsterdam\"},{\"id\":23,\"name\":\"Polonia\",\"capital\":\"Varsovia\"},{\"id\":24,\"name\":\"Portugal\",\"capital\":\"Lisboa\"},{\"id\":25,\"name\":\"Répública Checa\",\"capital\":\"Praga\"},{\"id\":26,\"name\":\"Rumanía\",\"capital\":\"Bucarest\"},{\"id\":27,\"name\":\"Suecia\",\"capital\":\"Estocolmo\"}]";

    @Test
    public void countryTest() throws Exception{
        this.mockMvc.perform(get("/countries")).
            andExpect(status().isOk()).
            andExpect(content().json(expectedJson));
    }
}

