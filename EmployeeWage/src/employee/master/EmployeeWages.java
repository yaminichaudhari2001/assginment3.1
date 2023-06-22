package employee.master;

public class EmployeeWages {
    public static void main(String[] args) {
        int IS_FFULLTIME=1;
        int EMP_RATE_PER_HOUR=20;
        int empHrs=0;
        int empWage=0;
        Double empcheck=Math.floor(Math.random()*10)%2;
        if(empcheck==IS_FFULLTIME)
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
