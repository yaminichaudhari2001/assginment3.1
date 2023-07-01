package employee.master;
//Ability to save the Total
//Wage for Each
//Company - Note: You can Create
//EmpWageBuilder for each
//Company
//- Use Instance Variable instead of
//function parameters
public class EmployeeWages {

          final int IS_PART_TIME = 1;
          final int IS_FULL_TIME = 2;
       final String  companyname;
        final int empratePerHour;
        final int numofworkingdays;
        final int maxhourspermonth;
        int totalEmpWage;
       public EmployeeWages(String companyname, int empratePerHour ,int  numofworkingdays , int maxhourspermonth)
       {
           this.companyname=companyname;
           this.empratePerHour=empratePerHour;
           this.numofworkingdays=numofworkingdays;
           this.maxhourspermonth=maxhourspermonth;
       }

          int computeEmpWage()
          {
            //Variables
            int empHrs = 0;
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;

            //Computation
            while (totalEmpHrs <= maxhourspermonth &&
                    totalWorkingDays < numofworkingdays) {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
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
            totalEmpWage = totalEmpHrs * empratePerHour;
            return totalEmpWage;
        }
    public String toString() {
        return "Total Emp Wage for Company: " + companyname +" is: " + totalEmpWage;
    }
        public static void main(String args[])
        { EmployeeWages dM = new EmployeeWages("D-Mart", 20, 20, 100);
            EmployeeWages am = new EmployeeWages("Amazon", 10, 10, 100);
            dM.computeEmpWage();
            System.out.println(dM);
            am.computeEmpWage();
            System.out.println(am);
        }

}



