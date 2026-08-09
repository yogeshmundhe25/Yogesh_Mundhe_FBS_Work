//3. Print an inverted right-angled triangle pattern
//Input: n = 5
#include <stdio.h>

int main() {
    int n = 5;   
    int row, col;   

    for (row = n; row >= 1; row--) {
        for (col = 1; col <= row; col++) {
            printf("* ");
        }
        printf("\n");
    }

    return 0;
}
