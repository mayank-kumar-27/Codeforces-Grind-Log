import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String[] m = new String[3];
            for (int i = 0; i < 3; i++) m[i] = sc.next();
            for (int i = 0; i < 3; i++) {
                if (m[i].contains("?")) {
                    if (!m[i].contains("A")) System.out.println("A");
                    else if (!m[i].contains("B")) System.out.println("B");
                    else System.out.println("C");
                }
            }
        }
        sc.close();
    }
}