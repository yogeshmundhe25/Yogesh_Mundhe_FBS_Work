//5.Write a program to check whether a person is eligible to vote (age = 18).
# include<stdio.h>

void checkvote(int);
void main()
{
	int age = 19;
	checkvote(age);
}

void checkvote(int age)
{

	
	if (age>=18)
	{
	printf("The person eligible to vote:%d ", age);
	
	}
	else
	 {
	 	printf("The person not eligible to vode:%d", age );
		 }	
	
}