package HW9_animals;

public class Main {
    public static void main(String[] args) {

        dog dog = new dog ();
        dog.setName("Рэкс");
        dog.animal_plays();
        dog.bite();
        dog.run();
        dog.jump();

        bird bird = new bird();
        bird.setBird_species("Воробей");
        bird.hatch_chicks();
        bird.making_sounds();
        bird.peck();
        bird.sing();

    }
}
