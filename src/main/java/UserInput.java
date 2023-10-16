public enum UserInput {
    COMPANY_NAME("company name"),
    EMPLOYEE_FIRSTNAME("employee firstname"),
    EMPLOYEE_LASTNAME("employee lastname"),
    EMPLOYEE_SALARY("employee salary");

    private final String displayName;

    UserInput(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
