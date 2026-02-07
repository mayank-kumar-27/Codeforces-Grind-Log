#include <stdio.h>
int main() {
    int n, i = 0;
    scanf("%d", &n);
    while (n--) {
        int a, b, c;
        scanf("%d%d%d", &a, &b, &c);
        if (a == 1 && b == 1 || a == 1 && c == 1 || b == 1 && c == 1) i++;
    }
    printf("%d", i);
    return 0;
}