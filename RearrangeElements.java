import java.util.*;

public class RearrangeElements {
    public static int[] Brute(int arr[] , int n){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Step 1: Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                pos.add(arr[i]); // Add to positives
            else
                neg.add(arr[i]); // Add to negatives
        }

        // Step 2: Place positives at even indices and negatives at odd indices
        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = pos.get(i);       // Even index → positive
            arr[2 * i + 1] = neg.get(i);   // Odd index → negative
        }

        return arr;
    }

    public static int[] Optimal(int[] arr , int n) {
        int[] ans = new int[n];

        int posIndex = 0, negIndex = 1;


        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {

                ans[negIndex] = arr[i];
                negIndex += 2;
            } else {

                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Your Number :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = Brute(arr , n);
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }

}
