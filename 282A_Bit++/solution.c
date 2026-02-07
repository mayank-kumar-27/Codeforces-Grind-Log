#include <stdio.h>
int main() {
    int n, x = 0;
    char s[4];
    scanf("%d", &n);
    while (n--) {
        scanf("%s", &s);
        x += (s[1] == '+') ? 1 : -1;
    }
    printf("%d", x);
    return 0;
}