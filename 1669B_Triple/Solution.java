import java.util.Scanner;
import java.util.HashMap;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> c = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                c.put(arr[i], c.getOrDefault(arr[i], 0) + 1);
            }
            int r = -1;
            for (int num : c.keySet()) if (c.get(num) >= 3) { r = num; break; }
            System.out.println(r);
        }
        sc.close();
    }
}