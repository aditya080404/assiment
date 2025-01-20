import java.util.*;

public class armstrongNum {
    public static void armstrong(int num){
        String str = num +"";
        int n= str.length();

        int num2= num;
        int sum=0;
        
while(num2>0){
            int  rem = num2%10;
             
             
             sum =  sum+(int) Math.pow(rem,n);
             num2 = num2/10;
        }

        if (num == sum){
            System.out.println("Armstring");
        }
        else{
            System.out.println("Not Armstrong");
        }
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");

        int target = sc.nextInt();

      
        armstrong(target);
        
    }
    
}
