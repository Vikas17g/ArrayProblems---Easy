import java.util.Scanner;

public class CountAppearOnce {
    public static int Brute(int arr[] , int n){
        n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;


            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    count++;
            }


            if (count == 1) return num;
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();

        int arr[] =  new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
            int result= Brute(arr , n);
        System.out.println(result);
    }
}
