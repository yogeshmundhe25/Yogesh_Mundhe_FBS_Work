//7.strncmp()

#include <stdio.h>
#include <string.h>

int main()
{
    char str1[] = "Hello";
    char str2[] = "Helium";

    printf("Result: %d\n", strncmp(str1, str2, 3));

    return 0;
}