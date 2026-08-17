//2.2 Accept three sides of a triangle from the user and determine whether the triangle isequilateral, isosceles, or scalene.
#include <stdio.h>

void triangle(int , int , int );   

int main()
{
    int a, b, c;

    printf("Enter three sides of the triangle: ");
    scanf("%d %d %d", &a, &b, &c);

    triangle(a, b, c);   
    return 0;
}

void triangle(int a, int b, int c)   
{
    if (a + b > c && a + c > b && b + c > a)   
    {
        if (a == b && b == c)
        {
            printf("Equilateral Triangle");
        }
        else if (a == b || b == c || a == c)
        {
            printf("Isosceles Triangle");
        }
        else
        {
            printf("Scalene Triangle");
        }
    }
    else
    {
        printf("Invalid Triangle");
    }
}
