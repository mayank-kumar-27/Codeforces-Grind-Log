#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    int a, b, p = 0, r = 0;
    while (n--) {
        scanf("%d%d", &a, &b);
        p -= a;
        p += b;
        r = (r > p) ? r : p;
    }
    printf("%d", r);
    return 0;
}