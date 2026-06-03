import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextInt();
            String a = sc.next();
            sc.nextInt();
            String b = sc.next();
            String c = sc.next();
            StringBuilder l = new StringBuilder();
            StringBuilder r = new StringBuilder(a);
            for (int i = 0; i < b.length(); i++) {
                if (c.charAt(i) == 'V') l.insert(0, b.charAt(i));
                else r.append(b.charAt(i));
            }
            System.out.println(l + r.toString());
        }
        sc.close();
    }
}