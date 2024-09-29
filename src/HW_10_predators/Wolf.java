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
        return "Волк. тип: " +this.type + " Среда обитания: " + this.habitat + " Максимальная скорость: " + this.maxSpeed + " Цвет: " + this.color
                + " Тип охоты: " + huntingMethod() ;
    };


}
