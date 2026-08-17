//2.5 Accept the price from user. 
//Ask the user if he is a student (user may say y or n). 
//If he is a student and he has purchased more than 500 than discount is 20% otherwisediscount is 10%.
//But if he is not a student then if he has purchased more than 600 discount is 15% otherwise there is not discount.


#include <stdio.h>

void discount(double price, char isStudent);   // function prototype with parameters

int main()
{
    double price;
    char isStudent;

    printf("Enter price: ");
    scanf("%lf", &price);

    printf("Are you a student? (y/n): ");
    scanf(" %c", &isStudent);

    discount(price, isStudent);   // pass values to function
    return 0;
}

void discount(double price, char isStudent)   // function definition with parameters
{
    double discount = 0, fprice;

    if (isStudent == 'y') {
        if (price >= 500) {
            discount = price * 0.20;
        } else {
            discount = price * 0.10;
        }
    } else {
        if (price >= 600) {
            discount = price * 0.15;
        } else {
            discount = 0;
        }
    }

    fprice = price - discount;

    printf("Discount = %.2lf\n", discount);
    printf("Final price = %.2lf\n", fprice);
}
