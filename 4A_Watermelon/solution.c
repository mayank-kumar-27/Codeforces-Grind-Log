#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    (n > 2 && n % 2 == 0) ? printf("YES") : printf("NO");
    return 0;
}