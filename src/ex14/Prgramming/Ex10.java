package ex14.Prgramming;

import java.util.List;

class Country{
    private String name;
    private int population;
    private double gdp;
    private List<City> cities;

    public Country(String name, int population, double gdp, List<City> cities) {
        this.name = name;
        this.population = population;
        this.gdp = gdp;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getGdp() {
        return gdp;
    }

    public List<City> getCities() {
        return cities;
    }
}
class City{
    private String name;
    private int population;
    private String countryName;

    public City(String name, int population, String countryName) {
        this.name = name;
        this.population = population;
        this.countryName = countryName;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountryName() {
        return countryName;
    }
}
public class Ex10 {
    public static void main(String[] args) {

    }
}
