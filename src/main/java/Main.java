public class Main {
    public static void main(String[] args) {
        Company company = new Company(UserDataReader.getNameFromUser(UserInput.COMPANY_NAME));
        CompanyManager manager = new CompanyManager(company);
        for (int i = 0; i < 5; i++) {
            manager.addEmployee(UserDataReader.getEmployeeDetailsFromUser());
        }
        UserDataViewer.printAllEmployees(company);

        while(true){
            NotificationViewer.printUsersOptions();
            switch (UserDataReader.getChoiceFromUser()){
                case 1 -> UserDataViewer.printSumOfSalariesInCompany(company);
                case 2 -> UserDataViewer.printAllEmployees(company);
                case 3 -> manager.addEmployee(UserDataReader.getEmployeeDetailsFromUser());
                case 4 -> {
                    UserDataReader.closeScanner();
                    System.exit(0);
                }
            }
        }
    }
}

