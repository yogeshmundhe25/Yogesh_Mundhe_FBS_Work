//3.strncpy()
#include<stdio.h>
#include<string.h>

int main()
{
    char dest[10];
    char src[] = "Hello";
    
    strncpy(dest, src, 3);
    dest[3] ='\0';
    
    printf("Copied string:%s\n", dest);
    
    return 0;
}