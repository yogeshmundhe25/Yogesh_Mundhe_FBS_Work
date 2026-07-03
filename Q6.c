//6.Write a program to check whether a given character is uppercase or lowercase.


#include <stdio.h>

void main() {
    char ch = 'A';  

    if (ch >= 'A' && ch <= 'Z') {
        printf("The character is uppercase.\n");
    } 
    else if (ch >= 'a' && ch <= 'z') {
        printf("The character is lowercase.\n");
    } 
    else {
        printf("The character is not an alphabet letter.\n");
    }
}
