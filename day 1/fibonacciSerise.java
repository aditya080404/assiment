import java.util.Scanner;

public class fibonacciSerise {
    static void fibo(int n){
        int i =0;
        while(fibonacci(i)< n ) {
            
            System.out.print(fibonacci(i) + " ");
            i++;
        
        }
    }

    public static int fibonacci(int num) {
         if (num <= 1) {
             return num; } 
             else {
                 return fibonacci(num - 1) + fibonacci(num- 2);
                
                } }
    public static void main(String[] args) {
           Scanner sc =new Scanner(System.in);
        System.out.println("Enter  limit value to print fibonacci :- ");
       int target= sc.nextInt();

       fibo(target);
    }
    
}
