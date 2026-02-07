#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int compare(const void *a, const void *b) { return (*(char *)a - *(char *)b); }
int main()
{
    char original[] = "Timur";
    qsort(original, 5, sizeof(char), compare);
    int n;
    scanf("%d", &n);

    while (n--)
    {
        int s;
        scanf("%d", &s);

        char *str = malloc((s + 1) * sizeof(char));
        if (!str) return 1;
        for (int i = 0; i < s; i++) scanf(" %c", &str[i]);
        str[s] = '\0';
        qsort(str, s, sizeof(char), compare);

        printf("%s", (strcmp(original, str) == 0) ? "YES\n" : "NO\n");
        free(str);
    }
    return 0;
}
