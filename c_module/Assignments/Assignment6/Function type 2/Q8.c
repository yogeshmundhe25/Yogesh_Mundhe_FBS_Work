//2.1 Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the desired operations.


#include <stdio.h>

void calculator(int, int, char);  

int main()
{
    int num1, num2;
    char op;

    printf("Enter first number: ");
    scanf("%d", &num1);

    printf("Enter second number: ");
    scanf("%d", &num2);

    printf("Enter operator (+, -, *, /, %%): ");
    scanf(" %c", &op); 
    
    calculator(num1, num2, op);   
   
    return 0;
}

void calculator(int num1, int num2, char op)   
{
    if (op == '+')
    {
        printf("Result = %d", num1 + num2);
    }
    else if (op == '-')
    {
        printf("Result = %d", num1 - num2);
    }
    else if (op == '*')
    {
        printf("Result = %d", num1 * num2);
    }
    else if (op == '/')
    {
        if (num2 != 0)
            printf("Result = %d", num1 / num2);
        else
            printf("Error: Division by zero is not allowed.");
    }
    else if (op == '%')
    {
        if (num2 != 0)
            printf("Result = %d", num1 % num2);
        else
            printf("Error: Modulus by zero is not allowed.");
    }
    else
    {
        printf("Invalid operator.");
    }
}
