import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = -1;
        while (++k < n) {
            String s = sc.next();
            if (s.toLowerCase().equals("yes")) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
