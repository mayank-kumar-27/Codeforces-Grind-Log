import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            boolean ok = false;
            if (s.length() > 2 && s.charAt(0) == '1' && s.charAt(1) == '0' && s.charAt(2) != '0') {
                int x = Integer.parseInt(s.substring(2));
                if (x >= 2) ok = true;
            }
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}