import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            int l = s.length();
            if (l <= 1 || l % 2 == 1) { System.out.println("NO"); continue; }
            char[] arr = s.toCharArray();
            int low = 0, high = l / 2;
            boolean ok = true;
            while (high < l) {
                if (arr[low] != arr[high]) { ok = false; break; }
                low++; high++;
            }
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}
