package HW_10_predators;

public class Zoo {
    public static void main(String[] args) {
        Predators[] zoo = new Predators[3];
        Crocodile crocodile1 = new Crocodile("болото", 48.00, "зеленый", "аллигатор");
        Leopard leopard1 = new Leopard("джунгли", 58.00, "желтый или рыжий с переходом в белый цвет на нижней стороне тела", "Африканский ");
        Wolf wolf1 = new Wolf("лес", 60.00, "серо-бурый", "лесной");
        zoo[0] = crocodile1;
        zoo[1] = wolf1;
        zoo[2] = leopard1;
        // for (int i = 0; i < 3; i++) {
        //     System.out.println(zoo[i]);
        Predators[] zooNew = new Predators[4];
        for (int i = 0; i < 3; i++) {
            zooNew[i] = zoo[i];
        }
            Crocodile crocodile2 = new Crocodile("река", 48.00, "коричневый", "африканский");
            zooNew[3] = crocodile2;
            for (int i = 0; i < 4; i++) {
                System.out.println(zooNew[i]);
            }
        }

//
    }

