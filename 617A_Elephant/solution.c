#include<stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    int s = 0;
    s += n / 5;
    n = n % 5;
    s += n / 4;
    n = n % 4;
    s += n / 3;
    n = n % 3;
    s += n / 2;
    n = n % 2;
    s += n;
    printf("%d\n", s);
}