#include<stdio.h>
int main() {
    int n;
    char s[101];
    scanf("%d",&n);
    while(n--) {
        scanf("%s",&s);
        int i = strlen(s);
        if (strlen(s)>10) printf("%c%d%c\n",s[0],i - 2,s[i-1]);
        else printf("%s\n",s);
    }
    return 0;
}