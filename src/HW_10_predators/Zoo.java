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
        Crocodile crocodile2 = new Crocodile("река", 48.00, "коричневый", "африканский");
        Predators newSettler = (Predators) crocodile2;
        zoo = addNewPlace(zoo, newSettler);
        System.out.println(zoo[3]);
       // System.out.println(zoo.length);
    }

    //метод увеличения массива
    public static Predators[] addNewPlace(Predators[] zoo, Predators newSettler) {
        Predators[] addNewPlace = new Predators[zoo.length + 1];
        addNewPlace[addNewPlace.length - 1] = newSettler;
        for (int i = 0; i < addNewPlace.length - 1; i++) {
            addNewPlace[i] = zoo[i];
        }
        return addNewPlace;

    }
}


