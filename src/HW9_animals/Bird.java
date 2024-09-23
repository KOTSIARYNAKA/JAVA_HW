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

    public String getBirdSpecies() {
        return birdSpecies;
    }

    public void setBirdSpecies(String birdSpecies) {
        this.birdSpecies = birdSpecies;
    }

    public double getMaximumFlightAltitude() {
        return maximumFlightAltitude;
    }

    public void setMaximumFlightAltitude(double maximumFlightAltitude) {
        this.maximumFlightAltitude = maximumFlightAltitude;
    }
}
