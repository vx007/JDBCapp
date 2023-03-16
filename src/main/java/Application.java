import java.util.List;

public class Application {
    public static void main(String[] args) {

        CityDAO cityDAO = new CityDAOImpl();
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        City city = new City("Los Angeles");
        cityDAO.create(city);

        Employee employee = new Employee("Bruce", "Willis", "male", 67, city);
        employeeDAO.create(employee);


        System.out.println(cityDAO.readById(1));
        System.out.println(employeeDAO.readById(1));


        List<City> cities = cityDAO.readAll();
        for (City entry : cities) {
            System.out.println(entry);
        }

        List<Employee> employees = employeeDAO.readAll();
        for (Employee entry : employees) {
            System.out.println(entry);
        }

        city.setName("New York");
        cityDAO.update(city);

        employee.setAge(68);
        employeeDAO.update(employee);

        cityDAO.delete(city);
        employeeDAO.delete(employee);
    }
}
