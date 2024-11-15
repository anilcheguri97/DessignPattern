import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee(1, "anil1", "hyderabad_1", 10000);
        Employee e2 = new Employee(5, "anil2", "hyderabad_2", 15000);
        Employee e3 = new Employee(3, "anil3", "hyderabad_3", 20000);
        Employee e4 = new Employee(4, "anil4", "hyderabad_4", 12000);
        Employee e5 = new Employee(2, "anil5", "hyderabad_5", 11000);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        Collections.sort(employeeList, Comparator.comparing(employee -> employee.getId()));
        Collections.sort(employeeList,Employee::compareBySal);
        employeeList.forEach(
                System.out::println
        );


    }
}