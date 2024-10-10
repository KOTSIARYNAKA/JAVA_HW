package HW_10_predators;

public class Zoo1 {
    private Predators[] predator;

    public Predators[] getPredators() {
        return predator;
    }

    public void setPredators(Predators[] predators) {
        this.predator = predators;
    }
    public Zoo1(){
        this.predator = new Predators[0];
    }
    public void addPredator(Predators predators){
        int amount = predator.length;
        if (amount == 0) {
            predator = new Predators[1];
            predator[0] = predators;

        }else {
                Predators[] copyOfAnimals = new Predators[predator.length + 1];
                for (int i = 0; i < predator.length + 1; i++) {
                    if (i != predator.length) {
                        copyOfAnimals[i] = predator[i];
                    } else {
                        copyOfAnimals[i] = predators;
                    }
                }
                predator = copyOfAnimals;
            }
        }

    }

