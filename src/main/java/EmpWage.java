import  java.util.Scanner;
public class EmpWage {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partDayHour = 8;
        int dailyEmployeeWage = (wagePerHour * fullDayHour);

        switch (salary){
            case 1 :
                System.out.println("fullDayHourSalary is " +  dailyEmployeeWage);
                break;
            case 2 :
                System.out.println("partDayHourSalary is " +  dailyEmployeeWage);
                break;
            default:
                System.out.println("Nothing");

        }
        int monthlyEmployeeWage = ( 20 * (wagePerHour * fullDayHour));
        System.out.println("Monthly wage is " + monthlyEmployeeWage);
    }
}
