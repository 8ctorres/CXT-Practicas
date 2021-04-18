package main.java.com.example.restservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
@RestController
public class CityController {
    private List<City> cities = new ArrayList<City>(10);
    public CityController(){
        cities.add(new City(1, "Coruña", "Coruña"));
        cities.add(new City(2, "Vigo", "Pontevedra"));
    };

    @GetMapping("/cities")
    public List<City> cities(){
        return cities;
    }
}

*/

@RestController
public class CityController{
    @GetMapping("/cities")
    public City city(
             @RequestParam(value = "name", defaultValue = "lacoru") String name
    ){
        return new City(54, name, "Coruña");
    }
}