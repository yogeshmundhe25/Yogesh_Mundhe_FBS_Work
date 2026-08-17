//4. a program to check whether a given character is a vowel or consonant.

#include <stdio.h>
void check(char);

int main() 
{
	char ch = 'b'; 
	check(ch);
}


void check(char ch)
{
      

   
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        printf("%c is a Vowel\n", ch);
    } else {
        printf("%c is a Consonant\n", ch);
    }

    
}
