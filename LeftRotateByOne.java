import java.util.*;
public class LeftRotateByOne {

    //O(n)
    //space is O(n) , if extra space is ask it will be O(1)
    public static void Optimal(int arr[] , int n){
        int temp = arr[0];
        for (int i = 1; i <= n-1; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();

        int arr[] =  new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        LeftRotateByOne.Optimal(arr , n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
