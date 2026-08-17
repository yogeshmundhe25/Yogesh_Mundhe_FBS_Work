//2. Write a program to check given 3 digit number is pallindrome or not.

#include <stdio.h>

void check(int , int , int );  

int main()
{
    int num = 121;   
    int first, last;

    first = num / 100;    
    last = num % 10;      

    check(first, last, num);   
    
}

void check(int first, int last, int num)   
{
    if (first == last) 
    {
        printf("%d is a Palindrome\n", num);
    } 
    else 
    {
        printf("%d is Not a Palindrome\n", num);
    }
}
