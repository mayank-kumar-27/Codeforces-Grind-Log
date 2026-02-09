#include <stdio.h>
int comp(const void *a, const void *b) { return (*(int *)a - *(int *)b); }
int main()
{
    int arr[4], c = 0;
    for (int i = 0; i < 4; i++) scanf("%d", &arr[i]);
    qsort(arr, 4, sizeof(arr[0]), comp);
    for (int i = 0; i < 3; i++) if (arr[i] == arr[i + 1]) c++;
    printf("%d", c);
    return 0;
}