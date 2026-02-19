#include<stdio.h>
int main()
{
	int days;
	int rent;
	printf("enter a number:");
	scanf("%d",&days);
	if(days>=1 &&3<=days)
	{
		rent=days*500;
		printf("rent for %d is:%d",days,rent);
	}
	else if (days>=4&&7<=days)
	{
		rent=days*400;
		printf("rent for %d is:%d",days,rent);
	}
	else if (days>=8)
	{
		rent=days*300;
		printf("rent for %d is:%d",days,rent);
	}
}
