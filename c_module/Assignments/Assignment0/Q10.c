//Write a C program to input marks of five subjects, find the total marks, and calculate the percentage

#include <stdio.h>

void main() {
    int sub1 = 50, sub2 = 55, sub3 = 65, sub4 = 75, sub5 = 84, total;
    float percentage;

    total = sub1 + sub2 + sub3 + sub4 + sub5;
    percentage = (total / 500.0) * 100;  
    printf("Total = %d\n", total);
    printf("Percentage = %.2f%%\n", percentage);
}
