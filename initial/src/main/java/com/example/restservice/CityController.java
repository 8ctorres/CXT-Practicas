package main.java.com.example.restservice;

@RestController
public class CityController {
    private List<City> cities = new ArrayList<City>(10);
    cities.add(new City(1, "Coruña", "Coruña"));
    cities.add(new City(2, "Vigo", "Pontevedra"));

    @GetMapping("/cities")
    public List<City> cities(){
        return cities;
    }
}
