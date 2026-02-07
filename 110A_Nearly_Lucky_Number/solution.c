#include <stdio.h>
int main() {
    char s[101];
    scanf("%s", &s);
    int n = 0;
    for (int i = 0; i < strlen(s); i++) {
        if (s[i] == '4' || s[i] == '7') n++;
        if (n > 7) break;
    }
    printf("%s", (n == 4 || n == 7) ? "YES" : "NO");
    return 0;
}