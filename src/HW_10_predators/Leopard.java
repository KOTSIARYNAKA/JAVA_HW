package HW_10_predators;

public class Leopard extends Predators {
    String type;
    public Leopard(String habitat, Double maxSpeed, String color, String type){
        super(habitat, maxSpeed, color);
        this.type = type;

    }


    @Override
    public String huntingMethod() {
        return "догнать жертву";

    }
    @Override
    public void sound() {
        System.out.println("Raaaaawwwwrrrr");

    }
    @Override
    public String toString(){
        return "Леопард\nТип: " +this.type + "\nСреда обитания: " + this.habitat + "\nМаксимальная скорость: " + this.maxSpeed + " км/ч\nЦвет: " + this.color
                + "\nТип охоты: " + huntingMethod() ;
    };

}
