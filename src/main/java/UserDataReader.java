import java.util.Scanner;

public class UserDataReader {

    private static Scanner scanner = new Scanner(System.in);

    public static Employee getEmployeeDetailsFromUser() {
        Employee employee = new Employee();
        employee.setFirstName(getNameFromUser(UserInput.EMPLOYEE_FIRSTNAME));
        employee.setLastName(getNameFromUser(UserInput.EMPLOYEE_LASTNAME));
        employee.setSalary(getSalaryFromUser());
        return employee;
    }

    public static String getNameFromUser(UserInput nameType) {
        while (true) {
            NotificationViewer.printDetailRequestMessage(nameType);
            String name = scanner.nextLine();
            if (UserDataValidator.checkIfNameIsValid(name)) {
                return name;
            }
        }
    }

    public static void closeScanner() {
        scanner.close();
    }

    private static long getSalaryFromUser() {
        while (true) {
            try {
                NotificationViewer.printDetailRequestMessage(UserInput.EMPLOYEE_SALARY);
                long salary = scanner.nextLong();
                scanner.nextLine();
                if (UserDataValidator.checkIfSalaryIsValid(salary)) {
                    return salary;
                } else {
                    ErrorMessageViewer.printSalaryBelowZeroErrorMessage();
                }
            } catch (java.util.InputMismatchException e) {
                scanner.next();
                ErrorMessageViewer.printNotANumberErrorMessage();
            }
        }
    }

    public static Integer getChoiceFromUser() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (UserDataValidator.checkIfChoiceIsValid(choice)) {
                    return choice;
                } else {
                    ErrorMessageViewer.printInvalidChoiceErrorMessage();
                }
            } catch (java.util.InputMismatchException e) {
                scanner.next();
                ErrorMessageViewer.printNotANumberErrorMessage();
            }
        }
    }
}