//4.strcat()

#include<stdio.h>
#include<string.h>

int main()
{
	char dest[20] = "Hello";
	char src[] = "World";
	
	strcat(dest, src);
	
	printf("%s\n", dest);
	
	return 0;
}