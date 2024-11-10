interface Workable {

    public void performDuties();

}


interface Service {

    public void isDuty();

}

public class Administrator extends Employee implements Workable , Service{
    private int hoursWorked;
    private double hourlyRate;

    public Administrator(String firstName, String lastName, int id, String department, boolean isMillitary, int hoursWorked, double hourlyRate) {
        super(firstName, lastName, id, department, isMillitary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void performDuties(){
        System.out.println(getFullName() + " is managing university administration.");
    }


    @Override
    public void isDuty(){
    }


}
