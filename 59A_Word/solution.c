#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
    char s[101];
    fgets(s, sizeof(s), stdin);
    s[strcspn(s, "\n")] = 0;

    int i = 0, cap = 0, sml = 0;
    while (s[i] != '\0')
    {
        if (s[i] >= 'A' && s[i] <= 'Z')  cap++;
        else if (s[i] >= 'a' && s[i] <= 'z') sml++;
        i++;
    }

    i = 0;
    if (cap > sml)
    {
        while (s[i] != '\0')
        {
            s[i] = toupper(s[i]);
            i++;
        }
    }
    else
    {
        while (s[i] != '\0')
        {
            s[i] = tolower(s[i]);
            i++;
        }
    }

    printf("%s", s);
    return 0;
}
