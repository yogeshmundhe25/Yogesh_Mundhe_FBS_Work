//4.Write a C program to swap two numbers using a temporary third variable. 
# include<stdio.h>

void main() {
    int a = 10, b = 20, temp;

    temp = a;   
    a = b;      
    b = temp;   

    printf("a = %d\n", a);
    printf("b = %d\n", b);
}