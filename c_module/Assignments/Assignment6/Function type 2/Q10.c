//2.3 Write a program to find greatest of three numbers using nested if-else.

#include <stdio.h>

void greatestNumber(int a, int b, int c);   // function prototype with parameters

int main()
{
    int a, b, c;

    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);

    greatestNumber(a, b, c);   // pass values to function
    return 0;
}

void greatestNumber(int a, int b, int c)   // function definition with parameters
{
    if (a > b) {
        if (a > c) {
            printf("Greatest number is: %d\n", a);
        } else {
            printf("Greatest number is: %d\n", c);
        }
    } else {
        if (b > c) {
            printf("Greatest number is: %d\n", b);
        } else {
            printf("Greatest number is: %d\n", c);
        }
    }
}
