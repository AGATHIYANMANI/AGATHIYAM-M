#include<stdio.h>
int main()
{
	int c;
	int s;
	float p;
	printf("enter cost prise:");
	scanf(" %d",&c);
	printf("enter selling price:");
	scanf(" %d",&s);
	p=s-c;
	if(p>0)
	{
		printf("profit:%f",p);
	}
	else if(p==0)
	{
		printf("no profit no loss");
	}
	else if(p<0)
	{
		printf("loss:%f",p);
	}
return 0;
}
