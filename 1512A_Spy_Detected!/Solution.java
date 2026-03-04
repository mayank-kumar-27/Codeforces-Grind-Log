import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < n; i++) { a[i] = sc.nextInt(); freq.merge(a[i], 1, Integer::sum); }
            for (int i = 0; i < n; i++) if (freq.get(a[i]) == 1) { System.out.println(i + 1); break; }
        }
        sc.close();
    }
}