import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') r.append("0");
            else { if (s.charAt(i + 1) == '.') r.append("1"); else r.append("2"); i++; }
        }
        System.out.println(r.toString());
        sc.close();
    }
}