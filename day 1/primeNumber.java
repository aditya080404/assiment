import java.util.*;

public class primeNumber {

    public static void checkPrime(int n){

        if(n==1){
            System.out.println("Prime");

           return;
        }
        for (int i =2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("Not prime  ");
                break;

            }

            else{
                System.out.println("Prime");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");

        int target = sc.nextInt();

        checkPrime(target);


    }
    
}
