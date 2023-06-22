package employee.master;
//Add Part time
//Employee & Wage
//- Assume Part time Hour is 8
public class EmployeeWages {
    public static void main(String[] args) {
        int IS_PART_TIME=1;
        int IS_FULL_TIME=2;
        int EMP_RATE_PER_HOUR=20;
        int empHrs=0;
        int empWage=0;
        Double empcheck=Math.floor(Math.random()*10)%2;
        if(empcheck==IS_PART_TIME)
        {
            empHrs=4;

        }
        else if(empcheck==IS_FULL_TIME)
        {
            empHrs=8;
        }
        else{
            empHrs=0;

        }
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("EmpWage "+empWage);

    }
}
