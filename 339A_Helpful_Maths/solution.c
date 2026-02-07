#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int comp(const void *a, const void *b) { return (*(int *)a - *(int *)b); }

int main()
{
    char *s = malloc(100 * sizeof(char));
    scanf("%s", s);
    int n = strlen(s);
    int cnt = (n + 1) / 2;
    int *nums = malloc(cnt * sizeof(int));

    for (int i = 0; i < n; i += 2) nums[i / 2] = s[i] - '0';
    qsort(nums, cnt, sizeof(int), comp);
    for (int i = 0; i < cnt; i++)
    {
        printf("%d", nums[i]);
        if (i < cnt - 1) printf("+");
    }

    free(nums); free(s);
    return 0;
}
