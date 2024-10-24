package HW_17Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CityDemo {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();

        cities.add(new City(1, "Tokio", 9300000, City.Continent.ASIA));
        cities.add(new City(2, "Moskow", 12500000, City.Continent.ASIA));
        cities.add(new City(3, "New York", 8400000, City.Continent.NORTH_AMERICA));
        cities.add(new City(4, "London", 9000000, City.Continent.EUROPE));
        cities.add(new City(5, "Paris", 2100000, City.Continent.EUROPE));
        cities.add(new City(6, "Sydney", 5300000, City.Continent.AUSTRALIA));
        cities.add(new City(7, "Berlin", 3700000, City.Continent.EUROPE));
        cities.add(new City(8, "Mumbai", 20400000, City.Continent.ASIA));
        cities.add(new City(9, "São Paulo", 12300000, City.Continent.SOUTH_AMERICA));
        cities.add(new City(10, "Canberra", 431000, City.Continent.SOUTH_AMERICA));
        cities.add(new City(11, "Toronto", 2800000, City.Continent.NORTH_AMERICA));
        cities.add(new City(12, "Cape Town", 4600000, City.Continent.NORTH_AMERICA));
        cities.add(new City(13, "Madrid", 3200000, City.Continent.EUROPE));
        cities.add(new City(14, "Rome", 2900000, City.Continent.EUROPE));
        cities.add(new City(15, "Delhi", 9300000, City.Continent.ASIA));
        cities.add(new City(16, "Los Angeles", 4000000, City.Continent.NORTH_AMERICA));
        cities.add(new City(17, "Bangkok", 10500000, City.Continent.ASIA));
        cities.add(new City(18, "Seoul", 9700000, City.Continent.ASIA));
        cities.add(new City(19, "Vancouver", 631000, City.Continent.NORTH_AMERICA));
        cities.add(new City(20, "Istanbul", 15000000, City.Continent.EUROPE));
        cities.add(new City(21, "Oslo", 697000, City.Continent.EUROPE));


        System.out.println("most populous city on the continent EUROPE " + cities.stream().filter(city -> city.getContinent() == City.Continent.EUROPE).max(Comparator.comparingInt(City::getPopulation)));
        System.out.println("city with the smallest population on the continent EUROPE " + cities.stream().filter(city -> city.getContinent() == City.Continent.EUROPE).min(Comparator.comparingInt(City::getPopulation)));
        System.out.println("most populous city " + cities.stream().max(Comparator.comparingInt(City::getPopulation)));
        System.out.println("city with the smallest population " + cities.stream().min(Comparator.comparingInt(City::getPopulation)));
        System.out.println("The first city you come across with a population of more than 1 million " + cities.stream().filter(city -> city.getPopulation() > 1000000).findAny());

        System.out.println("Города с населением больше 1 млн:");
        cities.stream().filter(city -> city.getPopulation() > 1000000).forEach(System.out::println); //1.7. Отобрать города с населением больше 1 млн.

        System.out.println("Города по возрастанию населения:");
        cities.stream().sorted(Comparator.comparingInt(City::getPopulation)).forEach(System.out::println);

        System.out.println("Города по убыванию населения:");
        cities.stream().sorted(Comparator.comparingInt(City::getPopulation).reversed()).forEach(System.out::println);

        Map<String, City> cityMap = cities.stream().collect(Collectors.toMap(City::getName, city -> city));

        System.out.println("Названия городов:");
        for (Map.Entry<String, City> entry : cityMap.entrySet()) {
            String name = entry.getKey();
            System.out.println("City Name: " + name);
        }



    }

}
