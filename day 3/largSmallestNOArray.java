public class largSmallestNOArray {

    public static void largest( int []arr){
        int largest =arr[0];

        for(int i =1;i<arr.length;i++){
            if (arr[i]>largest){
                largest= arr[i];
            }
           
        }
        System.out.println("Largest = " +largest);
    }
    public static void  smallest( int []arr){
        int smallest =arr[0];

        for(int i =0;i<arr.length;i++){
            if (arr[i]<smallest){
                smallest= arr[i];
            }
           
        }
        System.out.println("Smallest = "+smallest);
    }
    public static void main(String[] args) {
        int arr[]={4,7,1,8,5};
        largest(arr);
        smallest(arr);
    }
    
}
