package HW_11Robots;

import HW_10_predators.Predators;

public class Exhibition {
    private Robot[] robot;

    private Exhibition[] exhibition1;
    private Exhibition[] exhibition2;
    private Exhibition[] exhibition3;

    public Exhibition[] getExhibition1() {
        return exhibition1;
    }

    public void setExhibition1(Exhibition[] exhibition1) {
        this.exhibition1 = exhibition1;
    }

    public Exhibition[] getExhibition2() {
        return exhibition2;
    }

    public void setExhibition2(Exhibition[] exhibition2) {
        this.exhibition2 = exhibition2;
    }

    public Exhibition[] getExhibition3() {
        return exhibition3;
    }

    public void setExhibition3(Exhibition[] exhibition3) {
        this.exhibition3 = exhibition3;
    }
    public Exhibition(){
        this.exhibition1 = new Exhibition[0];
        this.exhibition2 = new Exhibition[0];
        this.exhibition3 = new Exhibition[0];

}
    public void addRobot(Robot robots){
        int amount = robot.length;
        if (amount == 0) {
            robot = new Robot[1];
            robot[0] = robots;

        }else {
            Robot[] copyOfRobots = new Robot[robot.length + 1];
            for (int i = 0; i < robot.length + 1; i++) {
                if (i != robot.length) {
                    copyOfRobots[i] = robot[i];
                } else {
                    copyOfRobots[i] = robots;
                }
            }
            robot = copyOfRobots;
        }
    }
}

