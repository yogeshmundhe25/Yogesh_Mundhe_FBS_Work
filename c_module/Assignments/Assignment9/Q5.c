//5.strncat()
#include<stdio.h>
#include<string.h>

int mani()
{
	char dest[10] = "Hello";
	char src[]= "World";
	
	strncat(dest, src, 3);
	
	printf("%s\n", dest);
	
	return 0;
}