public class Professor extends Employee implements Workable , Service{
    private int numberOfLectures;
    private double ratePerLecture;

    public Professor(String firstName, String lastName, int id, String department, boolean isMillitary, int numberOfLectures, double ratePerLecture) {
        super(firstName, lastName, id, department, isMillitary);
        this.numberOfLectures = numberOfLectures;
        this.ratePerLecture = ratePerLecture;
    }

    @Override
    public double calculateSalary() {
        return numberOfLectures * ratePerLecture;
    }

    @Override
    public void isDuty(){
    }

    @Override
    public void performDuties(){
        System.out.println(getFullName() + " is teaching " + numberOfLectures + " lectures.");
    }



}
