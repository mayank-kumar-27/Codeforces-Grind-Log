#include <stdio.h>

int main() {
    int a, b, c, d = 0;
    scanf("%d %d %d", &a, &b, &c);
    for (int i = 1; i <= c; i++) d += i * a;
    if (d > b) printf("%d", d - b);
    else printf("0");
    return 0;
}
