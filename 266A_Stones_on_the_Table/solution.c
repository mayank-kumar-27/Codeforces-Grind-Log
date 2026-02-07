#include <stdio.h>
int main()
{
    int n, c = 0;
    scanf("%d", &n);
    char s[n + 1];
    scanf("%s", s);
    for (int i = 1; i < n; i++) if (s[i] == s[i - 1]) c++;
    printf("%d\n", c);
    return 0;
}