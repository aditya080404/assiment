

public class sumOfArray {
    public static void sum(int arr[]){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];

        }
        System.out.println("total sum of array = "+ sum);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 1, 8, 5 };

sum(arr);
    
}}
