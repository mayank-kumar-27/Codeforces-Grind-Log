import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int s = 0, d = 0, left = 0, right = n - 1;
        boolean t = true;
        while (left <= right) {
            if (arr[left] > arr[right]) {
                if (t) s += arr[left];
                else d += arr[left];
                left++;
            } else {
                if (t) s += arr[right];
                else d += arr[right];
                right--;
            }
            t = !t;
        }
        System.out.printf("%d %d", s, d);
        sc.close();
    }
}