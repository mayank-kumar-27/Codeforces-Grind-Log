import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) arr[i] = sc.nextInt();
            int min = arr[0];
            for (int i = 0; i < a; i++) min = min > arr[i] ? arr[i] : min;
            for (int i = 0; i < a; i++) if (arr[i] == min) { arr[i] = arr[i] + 1; break; }
            int p = 1;
            for (int i = 0; i < a; i++) p *= arr[i];
            System.out.println(p);
        }
        sc.close();
    }
}