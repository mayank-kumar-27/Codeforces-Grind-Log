import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Set<Character> p = new HashSet<>();
        for (int i = 0; i < n; i++) if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') p.add(s.charAt(i));
        System.out.println(p.size());
        sc.close();
    }
}