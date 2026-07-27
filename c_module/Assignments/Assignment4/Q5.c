//5. Write a menu driven program to take a number for user and perform operations as follows.
//
//Press 1.To check number is even or odd.
//2.To check number is prime or not.
//3.To check number is pallindrome or not.
//4.To check number is positive, negative or zero.
//5.To reverse a number.
//6.To find sum of digits.





#include <stdio.h>

void main()
{
    int num, choice;
    int i, count = 0;
    int temp, rem;
    int reverse = 0;
    int sum = 0;

    printf("Enter a number : ");
    scanf("%d", &num);

    printf("\n----- MENU -----\n");
    printf("1. Even or Odd\n");
    printf("2. Prime or Not\n");
    printf("3. Palindrome or Not\n");
    printf("4. Positive, Negative or Zero\n");
    printf("5. Reverse a Number\n");
    printf("6. Sum of Digits\n");

    printf("Enter your choice : ");
    scanf("%d", &choice);

    if(choice == 1)
    {
        if(num % 2 == 0)
            printf("Even Number");
        else
            printf("Odd Number");
    }
    else
    {
        if(choice == 2)
        {
            count = 0;

            for(i = 1; i <= num; i++)
            {
                if(num % i == 0)
                    count++;
            }

            if(count == 2)
                printf("Prime Number");
            else
                printf("Not Prime Number");
        }
        else
        {
            if(choice == 3)
            {
                temp = num;
                reverse = 0;

                while(temp > 0)
                {
                    rem = temp % 10;
                    reverse = reverse * 10 + rem;
                    temp = temp / 10;
                }

                if(reverse == num)
                    printf("Palindrome Number");
                else
                    printf("Not Palindrome Number");
            }
            else
            {
                if(choice == 4)
                {
                    if(num > 0)
                        printf("Positive Number");
                    else if(num < 0)
                        printf("Negative Number");
                    else
                        printf("Zero");
                }
                else
                {
                    if(choice == 5)
                    {
                        temp = num;
                        reverse = 0;

                        while(temp > 0)
                        {
                            rem = temp % 10;
                            reverse = reverse * 10 + rem;
                            temp = temp / 10;
                        }

                        printf("Reverse = %d", reverse);
                    }
                    else
                    {
                        if(choice == 6)
                        {
                            temp = num;
                            sum = 0;

                            while(temp > 0)
                            {
                                rem = temp % 10;
                                sum = sum + rem;
                                temp = temp / 10;
                            }

                            printf("Sum of Digits = %d", sum);
                        }
                        else
                        {
                            printf("Invalid Choice");
                        }
                    }
                }
            }
        }
    }
}