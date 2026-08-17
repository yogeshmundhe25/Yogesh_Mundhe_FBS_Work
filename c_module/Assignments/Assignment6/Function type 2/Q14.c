//2.7 Accept the age and check if the person is:
//Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)
#include <stdio.h>

void checkage(int age);   // prototype

int main()
{
    int age;
    printf("Enter the age: ");
    scanf("%d", &age);

    checkage(age);   // pass age to function
    return 0;
}

void checkage(int age)   // definition with parameter
{
    if (age < 12)
    {
        printf("Child\n");
    }
    else if (age >= 12 && age <= 19)
    {
        printf("Teenager\n");
    }
    else if (age >= 20 && age <= 59)
    {
        printf("Adult\n");
    }
    else
    {
        printf("Senior\n");
    }
}
