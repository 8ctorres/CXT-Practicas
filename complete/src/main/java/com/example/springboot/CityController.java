package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;

@RestController
public class CityController {
    private List<City> cities = new ArrayList<City>(20);

    public CityController(){
        cities.add(new City(1, "A Coruña", "A Coruña"));
        cities.add(new City(2, "Vigo", "Pontevedra"));
    }

	  @RequestMapping("/cities")
	  public List<City> index() {
        return cities;
  	}
}
