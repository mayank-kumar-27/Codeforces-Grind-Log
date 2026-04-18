import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String r1 = sc.next();
            String r2 = sc.next();
            boolean same = true;
            for (int i = 0; i < n; i++) {
                char c1 = r1.charAt(i);
                char c2 = r2.charAt(i);
                if (c1 != 'R') c1 = 'X';
                if (c2 != 'R') c2 = 'X';
                if (c1 != c2) { same = false; break; }
            }
            System.out.println(same ? "YES" : "NO");
        }
        sc.close();
    }
}