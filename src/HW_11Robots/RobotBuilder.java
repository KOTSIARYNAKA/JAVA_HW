package HW_11Robots;

public class RobotBuilder implements RobotEngineer{
    @Override
    public void createRobot() {
        String model;
        int powerConsumption;
        String countryOfOrigin;
        String constructionUnit;
        String material;
        boolean isOn;
    }

    @Override
    public void repairRobot() {
        System.out.println("Робот-строитель: отремонтирован");
    }

    @Override
    public void replaceTheMainUnit() {
        System.out.println("Робот-строитель: заменена деталь");
    }

    @Override
    public void turnOnRobot() {
        System.out.println("Робот-строитель: включен");
    }

    @Override
    public void turnOffRobot() {
        System.out.println("Робот-строитель: выключен");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("Робот-строитель: строит разные штуки");
    }

    @Override
    public void solvingAnEngineeringProblem() {
        System.out.println("Робот-строитель: решает инжен ерные задачки");
    }
}
