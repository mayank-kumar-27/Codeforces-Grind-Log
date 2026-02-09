#include <stdio.h>
int main()
{
    char s1[101], s2[101];
    scanf("%s", &s1);
    scanf("%s", &s2);
    int n = strlen(s1);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        if ((s1[i] == '0' && s2[i] == '0') || (s1[i] == '1' && s2[i] == '1')) arr[i] = 0;
        else arr[i] = 1;
    }
    for (int i = 0; i < n; i++) printf("%d", arr[i]);

    return 0;
}