//2.Write a C program to find the area of a circle. 
#include <stdio.h>

void area();

void main()
{
    area();
    return 0;
}

void area()
{
    float r = 10, area;

    area = 3.14 * r * r;

    printf("Area of Circle = %.2f", area);
}