public class NotificationViewer {
    public static void printDetailRequestMessage(UserInput desiredDetail) {
        System.out.println("Please provide " + desiredDetail.getDisplayName());
    }

    public static void printUsersOptions() {
        System.out.println("_______________________________");
        System.out.println("What do you want to do next?");
        System.out.println("""
                1 – Print sum of all employees salary
                2 – Display all employees data
                3 – Add new employee
                4 – End program""");
    }
}