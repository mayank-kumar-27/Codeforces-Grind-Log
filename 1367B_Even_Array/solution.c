#include <stdio.h>

int main()
{
    int t;
    scanf("%d", &t);

    while (t--)
    {
        int n;
        scanf("%d", &n);
        int e = 0, o = 0;
        for (int i = 0; i < n; i++)
        {
            int x;
            scanf("%d", &x);
            if (i % 2 == 0 && x % 2 == 1) e++;
            if (i % 2 == 1 && x % 2 == 0) o++;
        }
        if (e != o) printf("-1\n");
        else printf("%d\n", e);
    }
    return 0;
}
