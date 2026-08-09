//11.strtok()
#include<stdio.h>
#include<string.h>

int main()
{
	char str[] = "c, java, python";
	char *token = strtok(str, ",");
	
	while(token != NULL)
	{
		printf("%sln", token);
		token = strtok(NULL, ",");
	}
	
	return 0;
}