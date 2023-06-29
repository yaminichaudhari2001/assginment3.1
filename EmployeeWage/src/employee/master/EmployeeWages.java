package employee.master;
//Compute Employee Wage
//for multiple companies - Note: Each Company has its own
//wage, number of working days
//and working hours per month
//- Use Class Method with function
//parameters instead of Class
//Variables
public class EmployeeWages {

        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        public static int computeEmpWage(String companyname, int empratePerHour ,int  numofworkingdays , int maxhourspermonth)
        {
            //Variables
            int empHrs = 0;
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;

            //Computation
            while (totalEmpHrs <= maxhourspermonth &&
                    totalWorkingDays < numofworkingdays )
            {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck)
                {
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs);
            }
            int totalEmpWage = totalEmpHrs * empratePerHour ;
            System.out.println("Total Emp Wage for company: " + companyname+" is:" + totalEmpWage);
            return totalEmpWage;


        }
        public static void main(String args[])
        {
            computeEmpWage("Flipkart",20,5,100);
            computeEmpWage("Amazon",10,2,100);
        }

}
