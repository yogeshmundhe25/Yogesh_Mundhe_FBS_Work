//7.Write a C program to convert given minutes into hours and remaining minutes. 
# include<stdio.h>

void main()
{
	int m = 130, h, r;
	h = m / 60;
	r = m  % 60;
	
	printf("The converted hours is %d\n", h);
	printf ("The reamaning minutes is %d", r);
}