import java.util.Scanner;
public class BuyAndSellStock {
    public static int Brute(int[] arr , int n) {

        int maxProfit = 0;

        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }


        return maxProfit;
    }

    public static int stockbuySell(int[] arr) {
        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price;
            }
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Your Number :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result =Brute(arr , n);
        System.out.println(result);
    }
}
