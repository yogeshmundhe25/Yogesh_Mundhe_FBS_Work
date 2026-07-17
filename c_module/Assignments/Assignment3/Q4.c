//4 Check the given number is prime or not. 
//Input: n = 7 
//Output: Prime 

# include<stdio.h>
void main()
{
	int n = 7;
	int i = 1 , count = 0;
	
	while (i <= n)
	{
		if (n % i == 0)
		{
			count++;
		}
		i++;
	}
	  if(count == 2)
	  {
	  	printf("Prime");
	  }
	  else
	    {
	    	printf("Not Prime");
		}
	
}