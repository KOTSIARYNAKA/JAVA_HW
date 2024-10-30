package HW_20;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ManDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        Man man = new Man("Aliaksander", 20, "Belov");
        man.classInf();


HelloWorld hello = new HelloWorld();
        try {
            Method helloMethod = hello.getClass().getDeclaredMethod("printHelloWorld");
            helloMethod.setAccessible(true);
            helloMethod.invoke(hello);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (SecurityException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
