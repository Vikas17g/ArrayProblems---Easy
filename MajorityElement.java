import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {

    public static int Brute(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > (n / 2)) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int Better(int[] arr ,int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static int Optimal(int arr[] , int n){
        int count = 0 ;
        int el = 0;

        for(int i = 0 ; i < n ; i++){
            if(count==0){
                count = 1 ;
                el = arr[i];
            }else if(el ==arr[i]){
                count++;
            }else{
                count--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el) {
                cnt1++;
            }
        }
         if(count > n/2){
             return el;
         }
         return -1 ;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Your Number :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result  = MajorityElement.Better(arr , n);
        System.out.println("The maority elements are : "+result);
    }
}
