//1.Write a C program to add two integers and display the result 

#include<stdio.h>


int add(int, int);

void main()
{
	int a, b, result;
	
	printf("Enter the two numbers:");
	scanf("%d%d", &a, &b);
	
	result = add(a,b);
	printf("addition = %d", result);
}

int add(int a, int b)
{
	return a+b;
}