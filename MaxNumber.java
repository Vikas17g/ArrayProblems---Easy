import java.util.Arrays;
import java.util.Scanner;


public class MaxNumber {

    public int  brute(int arr[] , int n){
        Arrays.sort(arr);
        return arr[n-1];

    }
    //time complextity : O(N)
    //Space cpmplexity : O(1)
    //optimal
    public  void largeNumber(int arr[], int n ){
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("The max Number is :"+ max);
    }

  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Your Number : ");
      int n = sc.nextInt();

      int arr[] =  new int[n];

      for(int i = 0 ; i < n ; i++){
          arr[i] = sc.nextInt();
      }

   MaxNumber obj = new MaxNumber();
//      obj.largeNumber(arr , n);

      int ans  = obj.brute(arr , n);
      System.out.println(ans);
  }

}
