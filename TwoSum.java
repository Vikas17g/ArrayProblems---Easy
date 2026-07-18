import java.util.*;

public class TwoSum {
    public static void Brute(int arr[] , int n ,int target){
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    found = true;
                }

            }
            if(found) break;
        }
            if(found){
                System.out.print("Yes");
            }else{
                System.out.println("no");
            }
        }

    public static int[] Brute2(int arr[] , int n ,int target){

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
         return new int[] { -1 , -1};
    }
            public static String Better(int arr[] , int n , int target){
                    HashMap<Integer , Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int complement = target - arr[i];

                if(map.containsKey(complement)){
                    return "yes";
                }
                    map.put(arr[i] ,i);
            }
                return "no";
        }

    public static int[] Better2(int arr[] , int n , int target){
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];

            if(map.containsKey(complement)){
               return new int[] {map.get(complement), i};
            }
            map.put(arr[i] ,i);
        }
       return new int[] {-1 , -1};
    }



    public int[] twoSumIndices(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            // If complement found, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Store current element and index
            map.put(arr[i], i);
        }
        // No pair found
        return new int[] { -1, -1 };
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Your Number :");
        int n = sc.nextInt();

          int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter yout target Number:");
          int target = sc.nextInt();

          //Brute(arr , n , target);
    }

}
