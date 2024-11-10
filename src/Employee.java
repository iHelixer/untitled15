public abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private String department;
    private boolean isMillitary;

    public Employee(String firstName, String lastName, int id, String department, boolean isMillitary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
        this.isMillitary = isMillitary;
    }

    public abstract double calculateSalary();

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + getFullName() + ", Department: " + department;
    }

}
