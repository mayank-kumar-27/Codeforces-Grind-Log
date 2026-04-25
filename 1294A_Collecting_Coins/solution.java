import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();
            int sum = a + b + c + n;
            if (sum % 3 != 0) { System.out.println("NO"); continue; }
            int target = sum / 3, max = Math.max(a, Math.max(b, c));
            if (max <= target) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}