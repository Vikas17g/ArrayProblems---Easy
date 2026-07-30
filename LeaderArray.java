import java.util.*;

public class LeaderArray {

    public static void Brute(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        // Iterate through each element
        for (int i = 0; i < n; i++) {
            boolean leader = true;

            // Check elements to the right
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                ans.add(arr[i]);
            }
        }

        // Print leaders
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> Optimal(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (n == 0) {
            return ans;
        }

        // Last element of the array is always a leader
        int max = arr[arr.length - 1];
        ans.add(arr[arr.length - 1]);

        // Check elements from right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }

        /* Reverse the list to match
        the required output order */
        Collections.reverse(ans);

        // Return the leaders
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number :");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        Optimal(arr, n);
    }
}