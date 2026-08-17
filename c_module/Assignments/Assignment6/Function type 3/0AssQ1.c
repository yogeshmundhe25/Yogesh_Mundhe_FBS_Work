//1.Write a C program to add two integers and display the result 
# include<stdio.h>
void add(int, int);

void main()
{
	int a=10, b=20;
	add(a,b);
}
void add(int a, int b)
{
	int sum;
	sum = a + b;
	
	printf("sum of two integers is %d", sum);
}
