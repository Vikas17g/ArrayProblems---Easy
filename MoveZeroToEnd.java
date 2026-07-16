import java.util.Scanner;

public class MoveZeroToEnd {

    public static int[] brute(int arr[] , int n){
        int[] temp = new int[arr.length];

        int index = 0;
        for(int i = 0  ; i < n ; i++){
            if(arr[i] != 0){
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
                arr[i] = temp[i];
        }
       return arr;
    }

    public static void optimal(int arr[] ,  int n){
        int j = -1;

        // Find the first zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero found, return
        if (j == -1) return;

        // Start from the next index of first zero
        for (int i = j + 1; i < arr.length; i++) {
            // If current element is non-zero
            if (arr[i] != 0) {
                // Swap with nums[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // Move j to next zero
                j++;
            }
        }
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();

        int arr[] =  new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

       // brute(arr , n );
        optimal(arr , n);

        for(int i = 0 ; i < n ; i++){

            System.out.println(arr[i]);        }
    }
}
