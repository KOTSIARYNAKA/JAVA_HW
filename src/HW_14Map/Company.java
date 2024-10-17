package HW_14Map;
import java.util.HashMap;
import java.util.Map;

public class Company {
    public static void main(String[] args) {
        Map<String, Integer> departments = new HashMap<>();
        departments.put("HR", 10);
        departments.put("IT", 25);
        departments.put("Sales", 15);
        departments.put("Marketing", 8);
      //  1.1 Посчитать общее количество сотрудников
        int totalEmployees = departments.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Общее количество сотрудников: " + totalEmployees);
        // 1.2 Вывести все отделы в фирме
        System.out.println("Отделы в фирме: " + departments.keySet());
    }
}
