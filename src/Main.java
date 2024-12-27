import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Alex", Gender.MALE);
        Employee employee2 = new Employee("Mark", Gender.MALE);
        Employee employee3 = new Employee("Alyona", Gender.FEMALE);
        Employee employee4 = new Employee("Elena", Gender.FEMALE);

        List<Employee> employees = new ArrayList<>(List.of(employee1, employee2, employee3, employee4));
        celebrate(employees);
    }

    enum Holiday {
        NONE,
        NEW_YEAR,
        INTERNATIONAL_WOMEN_DAY,
        DEFENDER_DAY
    }
//    private static final Holiday today = Holiday.NONE;
    private static final Holiday today = Holiday.NEW_YEAR;
//    private static final Holiday today = Holiday.INTERNATIONAL_WOMEN_DAY;
//    private static final Holiday today = Holiday.DEFENDER_DAY;

    private static void celebrate(List<Employee> emp) {
        for (Employee employee : emp) {
            switch (today) {
                case NEW_YEAR:
                    System.out.println(employee.getName() + ", с Новым Годом!");
                    break;
                case DEFENDER_DAY:
                    if (employee.getGender() == Gender.MALE)
                        System.out.println(employee.getName() + ", С днем Защитника Отечества!");
                    break;
                case INTERNATIONAL_WOMEN_DAY:
                    if (employee.getGender() == Gender.FEMALE)
                        System.out.println(employee.getName() + ", с Международным Женским днем!");
                    break;
                default:
                    System.out.println(employee.getName() + ", просто насладись этим днем!");
            }
        }
    }

}
