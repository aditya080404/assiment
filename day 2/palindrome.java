import java.util.*;

public class palindrome {


    public static void palindromes(int num) {

        int n = num;
        int rem, sum = 0;

        while (n > 0) {
            rem = n % 10;
            sum = (sum*10) + rem;
            n = n / 10;

        }
        if(sum==num){
            System.out.println("Plindrom");
        }
        else{
            System.out.println("Not Plindrom");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number :- ");
        int target = sc.nextInt();

        palindromes(target);

    }
    
}
