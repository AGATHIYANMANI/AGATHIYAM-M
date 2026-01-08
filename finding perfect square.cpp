#include<stdio.h>
#include<math.h>
int main()
{
	int num;
	int root;
	printf("enter a number:");
	scanf(" %d",&num);
     root=sqrt(num);
	if(root*root==num)
	{
		
		printf("perfect square:%d",root);
	}
else
{
	printf("not a perfect square");
}
}
