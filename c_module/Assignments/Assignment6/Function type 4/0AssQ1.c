//1.Write a C program to add two integers and display the result 
# include<stdio.h>
int  add(int, int);

void main()
{
	int a=10, b=20, result;
	add(a,b);
	result = add(a,b);
	printf("Sum of integers%d", result);
}
int  add(int a, int b)
{
	int  sum;
	sum = a + b;

    return sum;
	
}
