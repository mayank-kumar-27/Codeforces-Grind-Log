import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next(), c = sc.next();
        char[] A = (a + b).toCharArray();
        char[] B = c.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println(Arrays.equals(A, B) ? "YES" : "NO");
        sc.close();
    }
}