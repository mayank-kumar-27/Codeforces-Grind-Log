import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String[] p = s.split(":");
            int h = Integer.parseInt(p[0]);
            String m = p[1];
            String period;
            int nh;
            if (h == 0) {
                nh = 12;
                period = "AM";
            } else if (h < 12) {
                nh = h;
                period = "AM";
            } else if (h == 12) {
                nh = 12;
                period = "PM";
            } else {
                nh = h - 12;
                period = "PM";
            }
            System.out.printf("%02d:%s %s%n", nh, m, period);
        }

        sc.close();
    }
}