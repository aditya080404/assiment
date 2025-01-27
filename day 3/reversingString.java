import java.util.Scanner;

public class reversingString {
    public static void reverse(String target){

        String rev="";
         
         for(int i=target.length()-1;i>=0;i--){
            rev= rev+target.charAt(i);

         }

         System.out.println(rev);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String");
        String target = sc.nextLine();

        reverse(target);

    }
}
