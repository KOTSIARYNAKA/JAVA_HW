package HW_12generics;

public class DemoTask1 {
    public static void main(String[] args) {
        Task1<Integer> s = new Task1<>();
        s.addThing(1);
        s.addThing(5);
        s.addThing(3);
        s.addThing(1);
        System.out.println(s.toString());

        Task1<String> b = new Task1<>();
        b.addThing("Один");
        b.addThing("Два");
        b.addThing("Три");
        System.out.println(b.toString());
    }


}
