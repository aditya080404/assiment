import java.util.*;
public class sumDigites {


    
    public static void sum(int num){

      int n =num;
      int rem ,sum=0;

      while (n>0) {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
        
      }
      System.out.println(sum);


    
        
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
     System.out.println("Enter  number :- ");
    int target= sc.nextInt();

   
 sum(target);
    
    
}
}

