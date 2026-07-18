import java.util.*;

public class Sort012s {
    public static void Brute(int[] arr, int n){
        int count0 = 0, count1 = 0 , count2 = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0) count0++;
            else if(arr[i] == 1) count1++;
            else count2++;
        }
        int index = 0;
        while(count0-->0){
            arr[index++] = 0;
        }

        while(count1-->0){
            arr[index++] = 1;
        }

        while(count2-->0){
            arr[index++] = 2;
        }
    }

    public static void Optimal(int arr[] ,  int n){
                int low = 0 , mid = 0 , high = arr.length-1;

                while(mid<=high){
                    if(arr[mid] == 0){
                        int temp = arr[low];
                        arr[low] = arr[mid];
                        arr[mid] = temp;
                        low++;
                        mid++;
                    }else if(arr[mid] == 1){
                        mid++;
                    }else{
                        int temp = arr[mid];
                        arr[mid] = arr[high];
                        arr[high] = temp;
                        high--;
                    }
                }
            }

    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Your Number :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Optimal(arr , n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
