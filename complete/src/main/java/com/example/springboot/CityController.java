package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.ArrayList;

@RestController
public class CityController {
    private List<City> cities = new ArrayList<City>(20);
    private List<Country> countries = new ArrayList<Country>(20);

    public CityController(){
        cities.add(new City(1, "A Coruña", "A Coruña"));
        cities.add(new City(2, "Vigo", "Pontevedra"));
        cities.add(new City(3, "Ourense", "Ourense"));
        cities.add(new City(4, "Lugo", "Lugo"));
        cities.add(new City(5, "Santiago de Compostela", "A Coruña"));
        cities.add(new City(6, "Pontevedra", "Pontevedra"));
        cities.add(new City(7, "Ferrol", "A Coruña"));
        cities.add(new City(8, "Narón", "A Coruña"));
        cities.add(new City(9, "Vilagarcía de Arousa", "Pontevedra"));
        cities.add(new City(10, "Oleiros", "A Coruña"));
        cities.add(new City(11, "Arteixo", "A Coruña"));
        cities.add(new City(12, "Ribeira", "A Coruña"));
        cities.add(new City(13, "Carballo", "A Coruña"));
        cities.add(new City(14, "Ames", "A Coruña"));
        cities.add(new City(15, "Culleredo", "A Coruña"));
        cities.add(new City(16, "Redondela", "Pontevedra"));
        cities.add(new City(17, "Moaña", "Pontevedra"));
        cities.add(new City(18, "Marín", "Pontevedra"));
        cities.add(new City(19, "Cangas", "Pontevedra"));
        cities.add(new City(20, "O Porriño", "Pontevedra"));

        countries.add(new Country(1, "Alemania", "Berlín"));
        countries.add(new Country(2, "Austria", "Viena"));
        countries.add(new Country(3, "Bélgica", "Bruselas"));
        countries.add(new Country(4, "Bulgaria", "Sofía"));
        countries.add(new Country(5, "Chipre", "Nicosia"));
        countries.add(new Country(6, "Croacia", "Zagreb"));
        countries.add(new Country(7, "Dinamarca", "Copenhague"));
        countries.add(new Country(8, "Eslovaquia", "Bratislava"));
        countries.add(new Country(9, "Eslovenia", "Luibliana"));
        countries.add(new Country(10, "España", "Madrid"));
        countries.add(new Country(11, "Estonia", "Tallín"));
        countries.add(new Country(12, "Finlandia", "Helsinki"));
        countries.add(new Country(13, "Francia", "París"));
        countries.add(new Country(14, "Grecia", "Atenas"));
        countries.add(new Country(15, "Hungría", "Budapest"));
        countries.add(new Country(16, "Irlanda", "Dublín"));
        countries.add(new Country(17, "Italia", "Roma"));
        countries.add(new Country(18, "Letonia", "Riga"));
        countries.add(new Country(19, "Lituania", "Vilna"));
        countries.add(new Country(20, "Luxemburgo", "Luxemburgo"));
        countries.add(new Country(21, "Malta", "La Valeta"));
        countries.add(new Country(22, "Países Bajos", "Ámsterdam"));
        countries.add(new Country(23, "Polonia", "Varsovia"));
        countries.add(new Country(24, "Portugal", "Lisboa"));
        countries.add(new Country(25, "Répública Checa", "Praga"));
        countries.add(new Country(26, "Rumanía", "Bucarest"));
        countries.add(new Country(27, "Suecia", "Estocolmo"));
    }

	  @RequestMapping("/cities")
	  public List<City> city() {
        return cities;
  	}

    @RequestMapping("/cities/{id}")
    public City cityById(
      @PathVariable("id") int id) {
        return cities.get(id-1);
    }

    @RequestMapping("/countries")
	  public List<Country> country() {
        return countries;
  	}

    @RequestMapping("/countries/{id}")
    public Country countryById(
      @PathVariable("id") int id) {
        return countries.get(id-1);
    }
}
