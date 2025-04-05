import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        int r = s.nextInt() % n;
        s.close();
        for (int i = n - r; i < n; i++) System.out.print(arr[i] + " ");
        for (int i = 0; i < n - r; i++) System.out.print(arr[i] + " ");
    }
}
