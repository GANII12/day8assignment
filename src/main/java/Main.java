import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double emp = Math.floor(Math.random() * 10) ;

        if ( emp % 2 ==0 )
            System.out.println("Employee is absent");
        else
            System.out.println("Employee is present");
    }
}
