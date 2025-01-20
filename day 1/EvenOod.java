import java.util.*;

public class EvenOod {

    public static void EvenOROod(int num){
        
        if(num %2==0){
            System.out.println("this is a even number");
        }

        else{
            System.out.println("this is a ood number");
        }

    }
    public static void main(String[] args) {
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a integer value :- ");
       int target= sc.nextInt();

       EvenOROod(target);

    }
    
}
