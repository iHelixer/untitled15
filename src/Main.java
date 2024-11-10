//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Administrator administrator = new Administrator("Anna", "Pavlova", 1, "Facultet CZ",  false , 8, 100);
        Professor professor = new Professor("Yulia", "Nazar", 1, "ITTS", true, 4, 200);
        System.out.println(administrator.calculateSalary());
        System.out.println(professor.calculateSalary());
        administrator.performDuties();
        professor.performDuties();
    }

}