package com.example.springboot;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class CityControllerTest {

	private final String expectedJson = "[{\"id\":1,\"name\":\"A Coruña\",\"province\":\"A Coruña\"},{\"id\":2,\"name\":\"Vigo\",\"province\":\"Pontevedra\"},{\"id\":3,\"name\":\"Ourense\",\"province\":\"Ourense\"},{\"id\":4,\"name\":\"Lugo\",\"province\":\"Lugo\"},{\"id\":5,\"name\":\"Santiago de Compostela\",\"province\":\"A Coruña\"},{\"id\":6,\"name\":\"Pontevedra\",\"province\":\"Pontevedra\"},{\"id\":7,\"name\":\"Ferrol\",\"province\":\"A Coruña\"},{\"id\":8,\"name\":\"Narón\",\"province\":\"A Coruña\"},{\"id\":9,\"name\":\"Vilagarcía de Arousa\",\"province\":\"Pontevedra\"},{\"id\":10,\"name\":\"Oleiros\",\"province\":\"A Coruña\"},{\"id\":11,\"name\":\"Arteixo\",\"province\":\"A Coruña\"},{\"id\":12,\"name\":\"Ribeira\",\"province\":\"A Coruña\"},{\"id\":13,\"name\":\"Carballo\",\"province\":\"A Coruña\"},{\"id\":14,\"name\":\"Ames\",\"province\":\"A Coruña\"},{\"id\":15,\"name\":\"Culleredo\",\"province\":\"A Coruña\"},{\"id\":16,\"name\":\"Redondela\",\"province\":\"Pontevedra\"},{\"id\":17,\"name\":\"Moaña\",\"province\":\"Pontevedra\"},{\"id\":18,\"name\":\"Marín\",\"province\":\"Pontevedra\"},{\"id\":19,\"name\":\"Cangas\",\"province\":\"Pontevedra\"},{\"id\":20,\"name\":\"O Porriño\",\"province\":\"Pontevedra\"}]";

	@Autowired
	private MockMvc mvc;

	@Test
	public void getCities() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/cities").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(equalTo(expectedJson)));
	}
}
