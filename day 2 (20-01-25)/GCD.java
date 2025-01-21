import java.util.*;

public class GCD {
      public static void gcd(int a ,int b) {

       int result =0;

   for(int i =1 ;i<a/2&&i<b/2;i++){
        if(a%i==0 && b%i==0){
            result=i;
            i++;
        }
       
       
        
    }
    System.out.println(result);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number A :- ");
        int a = sc.nextInt();
        System.out.println("Enter  number B :- ");
        int b = sc.nextInt();

        gcd(a,b);

    }
}
