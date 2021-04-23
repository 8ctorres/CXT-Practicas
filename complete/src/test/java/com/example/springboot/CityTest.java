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
public class CityTest{

    @Autowired
    private MockMvc mockMvc;

    private final String expectedJson = "[{\"id\":1,\"name\":\"A Coruña\",\"province\":\"A Coruña\"},{\"id\":2,\"name\":\"Vigo\",\"province\":\"Pontevedra\"},{\"id\":3,\"name\":\"Ourense\",\"province\":\"Ourense\"},{\"id\":4,\"name\":\"Lugo\",\"province\":\"Lugo\"},{\"id\":5,\"name\":\"Santiago de Compostela\",\"province\":\"A Coruña\"},{\"id\":6,\"name\":\"Pontevedra\",\"province\":\"Pontevedra\"},{\"id\":7,\"name\":\"Ferrol\",\"province\":\"A Coruña\"},{\"id\":8,\"name\":\"Narón\",\"province\":\"A Coruña\"},{\"id\":9,\"name\":\"Vilagarcía de Arousa\",\"province\":\"Pontevedra\"},{\"id\":10,\"name\":\"Oleiros\",\"province\":\"A Coruña\"},{\"id\":11,\"name\":\"Arteixo\",\"province\":\"A Coruña\"},{\"id\":12,\"name\":\"Ribeira\",\"province\":\"A Coruña\"},{\"id\":13,\"name\":\"Carballo\",\"province\":\"A Coruña\"},{\"id\":14,\"name\":\"Ames\",\"province\":\"A Coruña\"},{\"id\":15,\"name\":\"Culleredo\",\"province\":\"A Coruña\"},{\"id\":16,\"name\":\"Redondela\",\"province\":\"Pontevedra\"},{\"id\":17,\"name\":\"Moaña\",\"province\":\"Pontevedra\"},{\"id\":18,\"name\":\"Marín\",\"province\":\"Pontevedra\"},{\"id\":19,\"name\":\"Cangas\",\"province\":\"Pontevedra\"},{\"id\":20,\"name\":\"O Porriño\",\"province\":\"Pontevedra\"}]";

    @Test
    public void cityTest() throws Exception{
        this.mockMvc.perform(get("/cities")).
            andExpect(status().isOk()).
            andExpect(content().json(expectedJson));
    }

    @Test
    public void city13Test() throws Exception{
        this.mockMvc.perform(get("/cities/13")).
            andExpect(status().isOk()).
            andExpect(content().json("{\"id\":13,\"name\":\"Carballo\",\"province\":\"A Coruña\"}"));
    }
}
