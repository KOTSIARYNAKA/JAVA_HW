package HW_11Robots;

public class DemoExhibition {
    public static void main(String[] args) {
        Robot [] exhebition1 = new Robot[3];
        RobotEngineer[] exhebition2 = new RobotEngineer[2];
        RobotSapper[] exhebition3 = new RobotSapper[1];
RobotChef Chef = new RobotChef("Universe", 44, "China", "а", true);
        RobotSapper sapper = new RobotSapper();
        RobotBuilder builder = new RobotBuilder();
exhebition1[0] = Chef;
//exhebition2[0] = Chef; // ошибка добавления
        exhebition1[1]=sapper;
        exhebition1[2]=builder;

        for (int o = 0; o<exhebition1.length; o++){
           exhebition1[o].uniquePossibility();
        }
exhebition2[0]=sapper;
       exhebition2[1]=builder;

        for (int o = 0; o<exhebition2.length; o++){
            exhebition2[o].solvingAnEngineeringProblem();
        }
exhebition3[0]=sapper;

        for (int o = 0; o<exhebition3.length; o++){
            exhebition3[o].uniquePossibility();
        }

    }

}
