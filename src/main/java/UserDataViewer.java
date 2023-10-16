public class UserDataViewer {

    public static void printSumOfSalariesInCompany(Company company) {
        CompanyManager manager = new CompanyManager(company);
        System.out.println("Sum of salaries in this company equals: " + manager.sumSalariesInCompany());
    }

    public static void printAllEmployees(Company company) {
        System.out.println("Here are all data about employee's salaries:");
        for (Employee employee : company.getEmployees()) {
            System.out.println(employee.toString());
        }
    }
}