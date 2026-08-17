//1.Write a C program to add two integers and display the result 
#include<stdio.h>

void add(int, int);

int main()
{
	int a,b;
	
    printf("Enter two numbers: ");
    scanf("%d%d",&a,&b);
    
    add(a,b);
   
}

void add(int a, int b)
{
    int sum;

     sum=a+b;

    printf("Addition = %d",sum);
}