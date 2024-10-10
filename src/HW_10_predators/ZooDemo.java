package HW_10_predators;

public class ZooDemo {
    public static void main(String[] args) {
        Zoo1 zoo1 = createZoo1();
        Wolf wolf2 = new Wolf("лес", 60.00, "серо-бурый", "лесной");
        zoo1.addPredator(wolf2);
    }
    private static Zoo1 createZoo1() {
        Crocodile crocodile1 = new Crocodile("болото", 48.00, "зеленый", "аллигатор");
        Leopard leopard1 = new Leopard("джунгли", 58.00, "желтый или рыжий с переходом в белый цвет на нижней стороне тела", "Африканский ");
        Wolf wolf1 = new Wolf("лес", 60.00, "серо-бурый", "лесной");
        Zoo1 zoo1 = new Zoo1();
        zoo1.addPredator(crocodile1);
        zoo1.addPredator(leopard1);
        zoo1.addPredator(wolf1);
        System.out.println(zoo1.getPredators().length);
        return zoo1;
    }

}
