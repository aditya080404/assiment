public class binnerySearch {
    public static void main(String[] args) {

        int arr[]={0,1,2,3,4,5,6,7,8,9};
        int x=9;
        
        int low=0;
        int high=arr.length-1;
        // int mid =0;

        while(low<=high){
          int  mid=low+(high-low)/2;
            if(arr[mid]==x){
                // System.out.println("index of x = "+mid);
                return mid;
            }
            if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return 0;

    }
}
