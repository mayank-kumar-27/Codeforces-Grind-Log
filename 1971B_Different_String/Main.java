import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            boolean same = true;
            for (int i = 1; i < s.length(); i++)  if (s.charAt(i) != s.charAt(0)) { same = false; break; }
            if (same) { System.out.println("NO"); continue; }

            char[] a = s.toCharArray();
            int j = -1;
            for (int i = 1; i < a.length; i++) if (a[i] != a[0]) { j = i; break; }
            char tmp = a[0]; a[0] = a[j]; a[j] = tmp;
            System.out.println("YES");
            System.out.println(new String(a));
        }
        sc.close();
    }
}