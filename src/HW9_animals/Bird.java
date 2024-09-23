package HW9_animals;

public class Bird extends Animal {
    private String birdSpecies;

    private double maximumFlightAltitude;

    public void sing(){
        System.out.println(birdSpecies + " поет");

    }
    public void peck(){
        System.out.println(birdSpecies + " клюет");
    }
    public void hatchChicks(){
        System.out.println(birdSpecies + " высиживает птенцов");
    }
    void makingSounds(){
        System.out.println("Птица поет");
    }

    public String getBird_species() {
        return birdSpecies;
    }

    public void setBirdSpecies(String bird_species) {
        this.birdSpecies = bird_species;
    }

    public double getMaximum_flight_altitude() {
        return maximumFlightAltitude;
    }

    public void setMaximum_flight_altitude(double maximumFlightAltitude) {
        this.maximumFlightAltitude = maximumFlightAltitude;
    }
}
