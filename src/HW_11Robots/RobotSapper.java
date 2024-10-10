package HW_11Robots;

public class RobotSapper implements RobotEngineer{
    String model;
    int powerConsumption;
    String deminer;
    String material;
    boolean isOn;

    @Override
    public void createRobot() {
        System.out.println("Робот-сапер: создан");
    }

    @Override
    public void repairRobot() {
        System.out.println("Робот-сапер: отремонтирован");
    }

    @Override
    public void replaceTheMainUnit() {
        System.out.println("Робот-сапер: заменена деталь");
    }

    @Override
    public void turnOnRobot() {
        System.out.println("Робот-сапер включен");
    }

    @Override
    public void turnOffRobot() {
System.out.println("Робот-сапер выключен");
    }

    @Override
    public void uniquePossibility() {
             System.out.println("Робот-сапер делает что-то уникальное");
    }

    @Override
    public void solvingAnEngineeringProblem() {
        System.out.println("Робот-сапер решает инженерную задачу");
    }
}
