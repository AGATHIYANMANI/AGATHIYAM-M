#include<stdio.h>
int main()
{
	int x;
	printf("how many products you need sir:");
	scanf(" %d",&x);
	if(x<=0)
	{
	   	printf("Order has no proper specified");
	}
	else if(x<70)
	{
	     printf("order conformed");
	}
	else
	{ 
	     printf("order  limit reached");
	}
	 printf("\n thank you!");
	return 0;
}
