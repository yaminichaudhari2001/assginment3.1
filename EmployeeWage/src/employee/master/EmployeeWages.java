package employee.master;

public class EmployeeWages {
    public static void main(String[] args) {
        int IS_FFULLTIME = 1;
        Double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FFULLTIME) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");

        }
    }
}