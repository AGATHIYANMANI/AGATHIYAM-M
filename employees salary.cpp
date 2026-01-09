#include<stdio.h>
int main()
{
 float base_salary;
 int seniority_level;
 float bonous=0.0;
 float Total_Compensation = 0.0;
 printf("Enter your base salary:");
 scanf(" %f", &base_salary);
 printf("Enter your performance rating (1-4):");
 scanf(" %d", &seniority_level);
 if(seniority_level == 1)
 {
 	bonous=(0.05)*base_salary;
 }
 else if(seniority_level == 2)
 {
 	bonous=(0.10)*base_salary;
 }
 else if(seniority_level == 3)
 {
 	bonous=(0.15)*base_salary;
 	}
 else if(seniority_level == 4)
 {
 	bonous=(0.20)*base_salary;
 	}
 	else
 	{
 		printf("invalid seniority level \n");
 	
	 }
	 Total_Compensation = base_salary + bonous;
 	printf("Base Salary: %f\n",base_salary);
 	printf("Bonous: %f\n",bonous);
 	printf("Total Compensation: %f\n",Total_Compensation);
 
 return 0;
}
 
