import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            int l = 0, r = n - 1;
            while (l <= r) {
                a.add(b[l++]);
                if (l <= r) a.add(b[r--]);
            }
            for (int x : a) System.out.print(x + " ");
            System.out.println();
        }
        sc.close();
    }
}