//4. pyramid pattern
//Input: n = 5
//Output:

#include<stdio.h>

void main()
{
	int n = 5;
	
	for(int i=1; i<= n; i++)
	{
		for(int j = 1; j <= n-1; j++)
		{
			printf("*");
		}
		   for(int k =1; k<= (1 * i - 1); k++)
		  {
			printf("*");
		  }
		  printf("\n");
	}
}
