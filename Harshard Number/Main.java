#include<stdio.h>
int main()
{
//fill the code
	int num,temp,sum=0;
	scanf("%d",&num);
	temp = num;

	 while(temp)
	{
		sum = sum + temp % 10;
		temp = temp / 10;
	}
	if(num % sum== 0)
		printf("Harshard Number");
	else
		printf("Not Harshard Number");
return 0;
}