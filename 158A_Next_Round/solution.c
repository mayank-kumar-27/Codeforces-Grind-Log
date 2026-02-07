#include <stdio.h>
int main() {
    int a, b, c = 0;
    scanf("%d%d", &a, &b);
    int arr[a];
    for (int i = 0; i < a; i++) scanf("%d", &arr[i]);
    int k = arr[b - 1];
    for (int i = 0; i < a; i++) if (arr[i] >= k && arr[i] > 0) c++;
    printf("%d", c);
    return 0;
}