#include<stdio.h>
int main()
{
	int amount;
	int rate;
int time;
	int intrest;
	printf("Enter principal amount:");
	scanf(" %d",&amount);
	printf("Enter annual interest rate (in percentage):");
	scanf(" %d",&rate);
	printf("Enter time period:");
	scanf(" %d",&time);
	intrest=amount*(1+rate/100)^time;
	printf(" %d",&intrest);
}
