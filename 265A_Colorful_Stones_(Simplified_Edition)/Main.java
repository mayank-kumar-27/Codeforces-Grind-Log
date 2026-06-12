import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        int p = 0;
        for (int i = 0; i < t.length(); i++) if (s.charAt(p) == t.charAt(i)) p++;
        System.out.println(p + 1);
        sc.close();
    }
}