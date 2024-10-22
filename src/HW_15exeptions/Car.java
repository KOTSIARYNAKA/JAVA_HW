package HW_15exeptions;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Car implements Serializable {

    private static final long serialVersionUID = 1L; // Уникальный идентификатор версии
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) throws IOException {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
