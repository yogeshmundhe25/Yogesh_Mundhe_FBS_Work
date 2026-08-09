//1. Print a solid square pattern
//Input: n = 4

#include <stdio.h>

int main() {
    int n = 5;   
    int row, col;

    for (row = 1; row <= n; row++)
   {
        for (col = 1; col <= row; col++) 
		{
            printf("* ");
        }
        printf("\n");
    }

    return 0;
}
