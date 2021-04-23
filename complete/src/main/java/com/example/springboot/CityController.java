package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.ArrayList;

@RestController
public class CityController {
    private List<City> cities = new ArrayList<City>(20);
    private List<Comunnitie> comunnities = new ArrayList<Comunnitie>(20);

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

        comunnities.add(new Comunnitie(1, "Andalucía", "Sevilla"));
        comunnities.add(new Comunnitie(2, "Aragón", "Zaragoza"));
        comunnities.add(new Comunnitie(3, "Principado de Asturias", "Oviedo"));
        comunnities.add(new Comunnitie(4, "Islas Baleares", "Palma de Mallorca"));
        comunnities.add(new Comunnitie(5, "Canarias", "Santa Cruz de Tenerife"));
        comunnities.add(new Comunnitie(6, "Cantabria", "Santander"));
        comunnities.add(new Comunnitie(7, "Castilla la Mancha", "Toledo"));
        comunnities.add(new Comunnitie(8, "Castilla y León", "Valladolid"));
        comunnities.add(new Comunnitie(9, "Cataluña", "Barcelona"));
        comunnities.add(new Comunnitie(10, "Ceuta", "Ceuta"));
        comunnities.add(new Comunnitie(11, "Extremadura", "Mérida"));
        comunnities.add(new Comunnitie(12, "Galicia", "Santiago de Compostela"));
        comunnities.add(new Comunnitie(13, "La Rioja", "Logroño"));
        comunnities.add(new Comunnitie(14, "Comunidad de Madrid", "Madrid"));
        comunnities.add(new Comunnitie(15, "Melilla", "Melilla"));
        comunnities.add(new Comunnitie(16, "Región de Murcia", "Murcia"));
        comunnities.add(new Comunnitie(17, "Navarra", "Pamplona"));
        comunnities.add(new Comunnitie(18, "Comunidad Valenciana", "Valencia"));
        comunnities.add(new Comunnitie(19, "País Vasco", "Vitoria"));
    }

	  @RequestMapping("/cities")
	  public List<City> index() {
        return cities;
  	}

    @RequestMapping("/cities/{id}")
    public City cityById(
      @PathVariable("id") int id) {
        return cities.get(id-1);
    }
}
