//8.Write a C program to input the length and width of a rectangle and find its perimeter. 

# include<stdio.h>

void main()
{
	int length = 12, width=15, perimeter;
	
	perimeter = 2 * (length+width);
	
	printf("Perimeter is : %d", perimeter);
}