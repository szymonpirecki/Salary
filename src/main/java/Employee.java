public class Employee {

    private String firstName;
    private String lastName;
    private long salary;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Salary for " + firstName + " " + lastName + " is: " + salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
