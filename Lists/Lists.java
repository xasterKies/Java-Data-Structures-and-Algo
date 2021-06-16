import java.util.List;
import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Tiokeng", "Samuel", 0));
        employeeList.add(new Employee("Guy", "Bostin", 1));
        employeeList.add(new Employee("Isaac", "Mathias", 2));
        employeeList.add(new Employee("Charles", "Hen", 3));
//stacks
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.print(employeeList.get(1));

    }
    
}
