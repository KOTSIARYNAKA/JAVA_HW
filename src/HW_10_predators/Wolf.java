package HW_10_predators;

public class Wolf extends Predators {
    String type;
    public Wolf(String habitat, Double maxSpeed, String color, String type){
        super(habitat, maxSpeed, color);
        this.type = type;

    }


    @Override
    public String huntingMethod() {
        return "окружить жертву";

    }
    @Override
    public void sound() {
        System.out.println("Волчьи звуки");

    }
    @Override
    public String toString(){
        return "Волк\nТип: " +this.type + "\nСреда обитания: " + this.habitat + "\nМаксимальная скорость: " + this.maxSpeed + " км/ч\nЦвет: " + this.color
                + "\nТип охоты: " + huntingMethod() ;
    };


}
