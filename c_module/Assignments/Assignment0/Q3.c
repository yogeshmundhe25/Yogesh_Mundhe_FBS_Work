//3.Write a C program to convert temperature from Celsius to Fahrenheit using the formula: F = (C *9/5) + 32 

# include<stdio.h>
void main()
{
	float c = 23, f;
	f = (c *9/5) + 32 ;
	
	printf("The converted temperature is :%.2f", f);
}