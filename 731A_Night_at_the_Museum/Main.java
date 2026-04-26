import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - 'a';
            int d = Math.abs(n - c);
            a += Math.min(d, 26 - d);
            c = n;
        }
        System.out.println(a);
        sc.close();
    }
}