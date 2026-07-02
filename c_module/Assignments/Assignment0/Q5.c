//5.Write a C program to input five numbers and find their average. 

# include<stdio.h>
void main()
{

float n1 = 10, n2= 20, n3= 30, n4= 40, n5= 50 ;
float sum, avg;

 sum = n1+n2+n3+n4+n5;
 avg = sum/ 5;
 
 printf("Average is : %.2f", avg);
 
}