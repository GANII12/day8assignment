package Employeewage;

public class UC4 {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int Emp_RATE_PER_HOUR = 20;

    public static void main(String[] args){
        //Variables
        int empHrs = 0;
        int empWage = 0;
        //Computation
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck){
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * Emp_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
    }
}
