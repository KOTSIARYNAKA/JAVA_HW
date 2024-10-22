package HW_15exeptions;

import java.io.*;

public class CarDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = new Car("Opel", "123", 2000);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\ekaterina.ezepchik\\IdeaProjects\\untitled\\src\\HW_15exeptions\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(car);
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ekaterina.ezepchik\\IdeaProjects\\untitled\\src\\HW_15exeptions\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        car = (Car) objectInputStream.readObject();

        System.out.println(car);

        objectInputStream.close();
    }
}
