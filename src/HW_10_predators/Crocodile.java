package HW_10_predators;

public class Crocodile extends Predators {
    String type;
    public Crocodile(String habitat, Double maxSpeed, String color, String type){
        super(habitat, maxSpeed, color);
            this.type = type;

    }


    @Override
    public String huntingMethod() {
        return "прыгнуть на жертву";

    }
    @Override
    public void sound() {
        System.out.println("Крокодильи звуки");

    }
    @Override
    public String toString(){
        return "Крокодил. тип: " +this.type + " Среда обитания: " + this.habitat + " Максимальная скорость: " + this.maxSpeed + " Цвет: " + this.color
                + " Тип охоты: " + huntingMethod() ;
    };

}
