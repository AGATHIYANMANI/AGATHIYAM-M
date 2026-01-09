#include<stdio.h>
#include<math.h>
int main()
{
	int n,ornum,rem,result=0;
	printf("enter a nuber:");
	scanf("%d",&n);
	ornum=n;
	while(ornum!=0)
	{
		rem=ornum%10;
	result=result + pow(rem,3);
	ornum=ornum/10;	
	
	}
	if(result==n)
	{
		printf("it is arm");
	}
	else
	{
		printf("it is nit");
	}
	return 0;
}
