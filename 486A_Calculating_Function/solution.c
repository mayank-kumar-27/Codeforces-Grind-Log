#include <stdio.h>

int main(void)
{
    long long n;
    scanf("%lld", &n);

    long long n1 = (n + 1) / 2;
    long long n2 = n / 2;

    long long diff = n1 * n1;
    long long sum = n2 * (n2 + 1);
    
    printf("%lld\n", sum - diff);
    return 0;
}
