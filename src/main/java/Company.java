import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Employee> employees;
    private String name;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    public List<Employee> getEmployees() {
        return employees;
    }
}