import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Set<String> set = new HashSet<>();
            for (char c : s.toCharArray()) set.add(String.valueOf(c));
            System.out.println(n + set.size());
        }
        sc.close();
    }
}