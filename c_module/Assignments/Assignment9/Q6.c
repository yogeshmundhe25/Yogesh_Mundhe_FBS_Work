//6.strcmp()

#include<stdio.h>
#include<string.h>

int main()
{
	char str1[] = "HelloWorld";
	char str2[] = "Hello";
	
	printf("Result:%d\n", strcmp(str1, str2));
	
	return 0;
}