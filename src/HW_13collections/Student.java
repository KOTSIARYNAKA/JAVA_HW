package HW_13collections;

import java.util.*;

public class Student {
    String name;
    String surname;
    String birthDate;
    String birthCity;
    double averageScore;
    double averageRating;

    public double getAverageScore() {
        return averageScore;
    }


    public Student(String name, String surname, String birthDate, String birthCity, double averageScore) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.birthCity = birthCity;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + averageScore + ")";
    }
}
