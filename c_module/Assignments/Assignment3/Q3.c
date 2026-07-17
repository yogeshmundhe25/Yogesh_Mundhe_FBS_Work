//3 Sum of numbers in given range. 
//Find sum of numbers from start to end. 
//Input: start = 1, end = 5 
//Output: 15
#include <stdio.h>

void main() {
    int start = 1, end = 5;   
    int sum = 0;
    int i = start;

    while(i <= end) {
        sum = sum + i;   
        i++;             
    }

    printf("Sum = %d", sum);

   
}
