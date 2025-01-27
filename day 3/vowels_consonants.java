import java.util.Scanner;

public class vowels_consonants {

public static void counte(String target){
    int vowels=0;
    int consonant =0;

    for(int i = 0;i<target.length();i++){
        if (target.charAt(i)== 'a'|| target.charAt(i)== 'e'||target.charAt(i)== 'i'||target.charAt(i)== 'o'||target.charAt(i)== 'u'){

            vowels++;

        }
        else if(target.charAt(i)== ' '){
            continue;
        }
        else{
            consonant++;
        }
    }
     System.out.println("vowels = "+ vowels);
     System.out.println("consonant = " + consonant);
}
    
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String");
        String target = sc.nextLine();

        counte(target);

       

    }
}
