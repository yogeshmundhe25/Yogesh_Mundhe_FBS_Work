//2.6 Accept a number and check if it is divisible by 3, 5, or both.
//(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//both" or” Divisible by None”)

#include <stdio.h>

void divisible(int num);   // function prototype with parameter

int main()
{
    int num;
    printf("Enter the Number: ");
    scanf("%d", &num);

    divisible(num);   // pass value to function
    return 0;
}

void divisible(int num)   // function definition with parameter
{
    if (num % 3 == 0 && num % 5 == 0)
    {
        printf("Divisible by both\n");
    }
    else if (num % 3 == 0)
    {
        printf("Divisible by 3 but not 5\n");
    }
    else if (num % 5 == 0)
    {
        printf("Divisible by 5 but not 3\n");
    }
    else
    {
        printf("Divisible by none\n");
    }
}
