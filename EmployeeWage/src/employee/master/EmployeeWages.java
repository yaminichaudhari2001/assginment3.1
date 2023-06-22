package employee.master;
//Add Part time
//Employee & Wage
//- Assume Part time Hour is 8
public class EmployeeWages {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int NUM_OF_WORKING_DAYS=20;
    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int totalempWage = 0;
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            switch (empcheck) {
                case IS_PART_TIME: {
                    empHrs = 4;
                    break;
                }
                case IS_FULL_TIME: {
                    empHrs = 8;
                    break;
                }
                default:
                    empHrs = 0;

            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalempWage=+empWage;
        }
        System.out.println("EmpWage " + empWage);
        System.out.println("totalWage "+totalempWage);
    }
}
