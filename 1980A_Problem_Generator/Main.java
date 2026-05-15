import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            String s = sc.next();
            int[] f = new int[7];
            for (char ch : s.toCharArray()) f[ch - 'A']++;
            int d = 0;
            for (int i = 0; i < 7; i++) if (f[i] < m) d += (m - f[i]);
            System.out.println(d);
        }
        sc.close();
    }
}