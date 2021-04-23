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
public class CommunityTest{

    @Autowired
    private MockMvc mockMvc;

    private final String expectedJson = "[{\"id\":1,\"name\":\"Andalucía\",\"capital\":\"Sevilla\"},{\"id\":2,\"name\":\"Aragón\",\"capital\":\"Zaragoza\"},{\"id\":3,\"name\":\"Principado de Asturias\",\"capital\":\"Oviedo\"},{\"id\":4,\"name\":\"Islas Baleares\",\"capital\":\"Palma de Mallorca\"},{\"id\":5,\"name\":\"Canarias\",\"capital\":\"Santa Cruz de Tenerife\"},{\"id\":6,\"name\":\"Cantabria\",\"capital\":\"Santander\"},{\"id\":7,\"name\":\"Castilla la Mancha\",\"capital\":\"Toledo\"},{\"id\":8,\"name\":\"Castilla y León\",\"capital\":\"Valladolid\"},{\"id\":9,\"name\":\"Cataluña\",\"capital\":\"Barcelona\"},{\"id\":10,\"name\":\"Ceuta\",\"capital\":\"Ceuta\"},{\"id\":11,\"name\":\"Extremadura\",\"capital\":\"Mérida\"},{\"id\":12,\"name\":\"Galicia\",\"capital\":\"Santiago de Compostela\"},{\"id\":13,\"name\":\"La Rioja\",\"capital\":\"Logroño\"},{\"id\":14,\"name\":\"Comunidad de Madrid\",\"capital\":\"Madrid\"},{\"id\":15,\"name\":\"Melilla\",\"capital\":\"Melilla\"},{\"id\":16,\"name\":\"Región de Murcia\",\"capital\":\"Murcia\"},{\"id\":17,\"name\":\"Navarra\",\"capital\":\"Pamplona\"},{\"id\":18,\"name\":\"Comunidad Valenciana\",\"capital\":\"Valencia\"},{\"id\":19,\"name\":\"País Vasco\",\"capital\":\"Vitoria\"}]";

    @Test
    public void communityTest() throws Exception{
        this.mockMvc.perform(get("/communities")).
            andExpect(status().isOk()).
            andExpect(content().json(expectedJson));
    }
}
