package employee.master;
//Refactor the Code
//to write a Class
//Method to Compute
//Employee Wage - Use Class Method and Class
//Variables
public class EmployeeWages {
    public static void calculate()
    {
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;
    final int EMP_RATE_PER_HOUR = 20;
    final int NUM_OF_WORKING_DAYS = 2;
    final int MAX_HRS_IN_MONTH = 10;
    int empHrs = 0;
    int empWage = 0;
    int totalemphrs = 0;
    int totalWorkingDays = 0;
    int totalempWage = 0;
    int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        while(totalemphrs <=MAX_HRS_IN_MONTH &&totalWorkingDays<NUM_OF_WORKING_DAYS)

    {
        totalWorkingDays++;

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
    }

    totalemphrs =empHrs;
        System.out.println("DAYS: "+totalWorkingDays +" total emp HRS "+empHrs);


    totalempWage =totalemphrs *EMP_RATE_PER_HOUR;
        System.out.println("Total EMP Wage "+totalempWage);
}

    public static void main(String[] args) {
        calculate();

    }
}
