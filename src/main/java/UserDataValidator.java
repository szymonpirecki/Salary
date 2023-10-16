import java.util.List;

public class UserDataValidator {

    public final static List<Integer> VALID_USERS_CHOICES = List.of(1, 2, 3, 4);

    public static boolean checkIfNameIsValid(String name) {
        return (name != null && !name.isEmpty());
    }

    public static boolean checkIfSalaryIsValid(long salary) {
        return (salary > 0);
    }

    public static boolean checkIfChoiceIsValid(Integer choice) {
        return VALID_USERS_CHOICES.contains(choice);
    }
}

