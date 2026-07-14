import java.util.Arrays;
import java.util.Scanner;

public class Seclargest {

    //brute
    // time : O(n log n ) by using sorting
    //space = O(1)
    public static void brute(int arr[] , int n){
        if(n==0 || n==1){
            System.out.print(-1 + " " + -1);
            return;
        }
        Arrays.sort(arr);

        int small = arr[1];
        int big = arr[n-2];

        System.out.println("Second smallest is " + small);

            System.out.println("Second largest is " + big);
        }
    public static int optimal(int arr[] , int n ){
        int max = arr[0] , seclargest = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                seclargest = max;
                max = arr[i];
            }else if(arr[i] > max &&  seclargest < arr[i]){
                seclargest = arr[i];
            }
        }
        return seclargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();

        int arr[] =  new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        //brute(arr , n);

        int result = optimal(arr , n);
        System.out.println(result);
    }

}
