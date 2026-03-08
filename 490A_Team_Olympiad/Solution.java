import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>[] g = new List[4];
        for (int i = 1; i <= 3; i++) g[i] = new ArrayList<>();
        for (int i = 1; i <= n; i++)  g[sc.nextInt()].add(i);

        int t = Math.min(g[1].size(), Math.min(g[2].size(), g[3].size()));
        System.out.println(t);
        for (int i = 0; i < t; i++) System.out.println(g[1].get(i) + " " + g[2].get(i) + " " + g[3].get(i));
        sc.close();
    }
}