
import java.util.*;

public class Factorial {
    
    public static int factorial(int num){

        if (num==0|| num==1){
            return 1;
        }
       else{
            return num*factorial(num-1);
       }
    
        
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
     System.out.println("Enter  number :- ");
    int target= sc.nextInt();

    System.out.println(factorial(target));
 }
    
    
}
