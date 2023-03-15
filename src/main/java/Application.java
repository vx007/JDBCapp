import java.util.List;

public class Application {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        Employee employee = new Employee("Bruce", "Willis", "male", 67, 1);

        employeeDAO.create(employee);

        System.out.println(employeeDAO.readById(1));

        List<Employee> employees = employeeDAO.readAll();

        for (Employee entry : employees) {
            System.out.println(entry);
        }

        employee.setCity(2);
        employeeDAO.update(employee);

        employeeDAO.delete(employee);
    }
}
