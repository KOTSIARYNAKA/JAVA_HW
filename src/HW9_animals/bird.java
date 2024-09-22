package HW9_animals;

public class bird extends animal{
    private String bird_species;

    private double maximum_flight_altitude;

    public void sing(){
        System.out.println(bird_species + " поет");

    }
    public void peck(){
        System.out.println(bird_species + " клюет");
    }
    public void hatch_chicks(){
        System.out.println(bird_species + " высиживает птенцов");
    }
    void making_sounds(){
        System.out.println("Птица поет");
    }

    public String getBird_species() {
        return bird_species;
    }

    public void setBird_species(String bird_species) {
        this.bird_species = bird_species;
    }

    public double getMaximum_flight_altitude() {
        return maximum_flight_altitude;
    }

    public void setMaximum_flight_altitude(double maximum_flight_altitude) {
        this.maximum_flight_altitude = maximum_flight_altitude;
    }
}
