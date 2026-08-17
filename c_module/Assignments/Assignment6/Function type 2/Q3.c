//3. Write a program to check whether a given year is a leap year.

#include <stdio.h>
void check(int );
int main()
{
	int year = 2025;  
	check(year);
}

void check(int year)
{
    
    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
        printf("%d is a Leap Year\n", year);
    } else {
        printf("%d is Not a Leap Year\n", year);
    }

    
}