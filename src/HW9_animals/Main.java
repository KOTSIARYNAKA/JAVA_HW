package HW9_animals;

public class Main {
    public static void main(String[] args) {

        Animal dog1=new Dog();
        dog1.makingSounds();

        Dog dog = new Dog();
        dog.makingSounds();
        dog.setName("Рэкс");
        dog.animalPlays();
        dog.bite();
        dog.run();
        dog.jump();

        Bird bird = new Bird();
        bird.setBirdSpecies("Воробей");
        bird.hatchChicks();
        bird.makingSounds();
        bird.peck();
        bird.sing();

    }
}
