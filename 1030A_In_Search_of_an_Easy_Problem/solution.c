#include <stdio.h>
int main() {
    int n, a;
    scanf("%d", &n);
    while (n--) {
        scanf("%d", &a);
        if (a == 1) {
            printf("HARD");
            return 0;
        }
    }
    printf("EASY");
    return 0;
}