
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            int sum = 0;
            for (int j = i + 1; j < a; j++) {
                sum += arr[j];
            }
            if (arr[i] > sum) {
                
                System.out.print(arr[i]+" ");
            }
        }
    }
}
