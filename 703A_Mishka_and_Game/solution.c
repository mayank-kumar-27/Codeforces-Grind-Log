#include <stdio.h>
int main() {
    int n, m = 0, c = 0;
    scanf("%d", &n);
    while (n--) {
        int a, b;
        scanf("%d", &a);
        scanf("%d", &b);
        if (a>b) m++;
        else if (a<b) c++;
    }
    if (m>c) printf("Mishka");
    else if (m<c) printf("Chris");
    else printf("Friendship is magic!^^");
    return 0;
}