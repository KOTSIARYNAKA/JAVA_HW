package HW_12generics;

public class Car extends Vehicle{
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return  "model='" + model + '\'' +
                ", year=" + year;
    }
}
