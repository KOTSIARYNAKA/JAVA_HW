package HW_17Lambda;

public class City {
    private int id;
    private String name;
    private int population;

    public enum Continent{
        AFRICA,
        ANTARCTICA,
        ASIA,
        EUROPE,
        NORTH_AMERICA,
        SOUTH_AMERICA,
        AUSTRALIA
    }
    Continent continent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public City(int id, String name, int population, Continent continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "City name " + name +
                ", population = " + population +
                ", continent = " + continent;
    }
    }

