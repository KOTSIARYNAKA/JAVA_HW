package HW_10_predators;

public abstract class Predators {
    String habitat;
    Double maxSpeed;
    String color;
    public Predators(String habitat, Double maxSpeed, String color){
        this.habitat = habitat;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }


    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract String huntingMethod ();
    public abstract String toString();
    public abstract void sound();

}
