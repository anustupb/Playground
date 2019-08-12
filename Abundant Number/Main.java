#include<stdio.h>
int main()
{
//fill the code
	int num,temp,sum=0;
	scanf("%d",&num);
	for(int i = 1; i < num; i++)
	{
		if(num % i == 0)
		{
			sum = sum + i;
		}
	}
	if(num < sum)
		printf("Abundant Number");
	else
		printf("Not Abundant Number");
return 0;
}