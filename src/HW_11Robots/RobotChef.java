package HW_11Robots;

public class RobotChef implements Robot{
    String model;
    int powerConsumption;
    String countryOfOrigin;
    String cookingUnit;
    boolean isOn;

    public RobotChef(String model, int powerConsumption, String countryOfOrigin, String cookingUnit, boolean isOn) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.countryOfOrigin = countryOfOrigin;
        this.cookingUnit = cookingUnit;
        this.isOn = isOn;
    }

    @Override
    public void createRobot() {

    }

    @Override
    public void repairRobot() {

    }

    @Override
    public void replaceTheMainUnit() {

    }

    @Override
    public void turnOnRobot() {
        isOn = true;
        System.out.println("Робот-повар включен");
    }

    @Override
    public void turnOffRobot() {
        isOn = false;
        System.out.println("Робот-повар выключен");
    }
}
