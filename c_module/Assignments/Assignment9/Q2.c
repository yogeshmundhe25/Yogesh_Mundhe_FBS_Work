//2.strcpy()
#include<stdio.h>
#include<string.h>

int main()
{
	char dest[10];
	char src[]="Hello";
	
	
	strcpy(dest, src);
	
	printf("Copied string:%s\n", dest);
	
	return 0;
}