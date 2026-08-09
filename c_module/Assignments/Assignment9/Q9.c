//9.strrchr()

#include<stdio.h>
#include<string.h>

int main()
{
	char str[] = "Programming";
	
	printf("%s\n", strrchr(str, 'g'));
	
	return 0;
	
}