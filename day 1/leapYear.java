import java.util.*;

public class leapYear {

    public static void checkLeap(int year){

        if (year %400==0 || year%4==0 && year % 100!=0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("NOT Leap year");
        }


    }
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
        System.out.println("Enter year  :- ");
       int target= sc.nextInt();

       checkLeap(target);
    }
    
}
