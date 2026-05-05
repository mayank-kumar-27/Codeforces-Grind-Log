import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), x = sc.nextInt();

            if (x != 1) {
                out.append("YES\n");
                out.append(n).append('\n');
                for (int i = 0; i < n; i++) {
                    out.append(1);
                    if (i + 1 < n) out.append(' ');
                }
                out.append('\n');
            } else {
                if (k == 1) {
                    out.append("NO\n");
                } else if (n % 2 == 0) {
                    out.append("YES\n");
                    out.append(n / 2).append('\n');
                    for (int i = 0; i < n / 2; i++) {
                        out.append(2);
                        if (i + 1 < n / 2) out.append(' ');
                    }
                    out.append('\n');
                } else {
                    if (k >= 3) {
                        out.append("YES\n");
                        out.append((n - 3) / 2 + 1).append('\n');
                        out.append(3);
                        if ((n - 3) / 2 > 0) out.append(' ');
                        for (int i = 0; i < (n - 3) / 2; i++) {
                            out.append(2);
                            if (i + 1 < (n - 3) / 2) out.append(' ');
                        }
                        out.append('\n');
                    } else {
                        out.append("NO\n");
                    }
                }
            }
        }
        System.out.print(out);
        sc.close();
    }
}