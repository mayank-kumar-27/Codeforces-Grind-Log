#include <stdio.h>
#include <string.h>

int main()
{
    char *s = malloc(101);
    char *s1 = malloc(101);
    scanf("%s", s);
    scanf("%s", s1);

    int l = strlen(s);
    if (l != strlen(s1)) {printf("NO"); return 0;}

    for (int i = 0; i < l; i++)if (s[i] != s1[l - 1 - i]) {printf("NO"); return 0;}
    printf("YES");
    return 0;
}
