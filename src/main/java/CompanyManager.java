public class CompanyManager {

    private final Company company;

    public CompanyManager(Company company) {
        this.company = company;
    }

    public void addEmployee(Employee employee) {
        company.getEmployees().add(employee);
    }

    public long sumSalariesInCompany() {
        long sum = 0;
        for (Employee employee : company.getEmployees()) {
            sum += employee.getSalary();
        }
        return sum;
    }
}