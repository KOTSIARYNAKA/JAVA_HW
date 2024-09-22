package HW9_animals;

public class dog extends animal{
    private String name;
    private String breed;
    private double weight;
    public void bite(){
        System.out.println(name + " кусается");
    }
    public void run(){
        System.out.println(name + " бегает");
    }
    public void jump(){
        System.out.println(name + " прыгает");
    }
    void animal_plays(){
        System.out.println("Собака бегает за мячиком");
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
