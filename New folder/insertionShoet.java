public class insertionShoet {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 4, 3,1, 5, 6 };
        for (int i = 1; i < arr.length ; i++) {
            int j=i;
            while (j>0&& arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
                
            }
}
printarr(arr);
    }
    }