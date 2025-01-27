import java.util.Scanner;

public class palindrome {
     public static boolean Palindrome(String target){
        int left = 0;
        int right= target.length()-1;

  while(left<right){
    if( target.charAt(left)!= target.charAt(right)){
       return false;}
        left++;
        right--;

  }
   return true;
       

         }
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter String");
    String target  = sc.nextLine(); 

    if(Palindrome(target)){
        System.out.println("Palindrom");

    }
    else{
        System.out.println("Not Palindrom");
    }

}

        


     }

