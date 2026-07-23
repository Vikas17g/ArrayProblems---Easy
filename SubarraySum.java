import java.util.*;

public class SubarraySum {

    public static void Brute(int arr[], int n, int k) {
        int length = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;

                for (int l = i; l <= j; l++) {
                    sum += arr[l];
                }

                if (sum == k) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }

        System.out.println("Longest Length = " + length);
    }

    public static int Better(int[] arr , int n ) {

        int maxLen = 0;
        Map<Integer, Integer> sumIndexMap = new HashMap<>();

        int sum = 0;

        // iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // update running sum
            sum += arr[i];

            // if sum is zero, subarray [0..i] has zero sum
            if (sum == 0) {
                // update best length
                maxLen = i + 1;
            }
            // if this sum seen before, subarray (prevIndex..i] has zero sum
            else if (sumIndexMap.containsKey(sum)) {
                // maximize length using previous index
                maxLen = Math.max(maxLen, i - sumIndexMap.get(sum));
            }
            // first time seeing this sum, store its index
            else {
                sumIndexMap.put(sum, i);
            }
        }

        // return best length
        return maxLen;
    }


public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Your Number :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Your Number : ");
        int k = sc.nextInt();

      //  Brute(arr , n , k);
        Better(arr , n);

    }
}
