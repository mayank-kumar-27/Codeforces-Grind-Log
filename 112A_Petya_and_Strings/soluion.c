#include<stdio.h>
int main()
{
    char *s = malloc(101);
    char *s1 = malloc(101);
    scanf("%s", s);
    scanf("%s", s1);

    int i = 0;
    while(s[i] != '\0')
    {
        if (tolower(s[i]) < tolower(s1[i])) {printf("%d",-1); return 0;}
        else if (tolower(s[i]) > tolower(s1[i])) {printf("%d",1); return 0;}
        i++;
    }   printf("%d",0);
    return 0;
}