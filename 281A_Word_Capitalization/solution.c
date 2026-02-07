#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main() {
    char s[1001];
    fgets(s, sizeof(s), stdin);
    s[strcspn(s, "\n")] = 0;
    s[0] = toupper(s[0]);

    printf("%s\n", s);
    return 0;
}