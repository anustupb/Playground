#include<stdio.h>
#include<math.h>

int PerfectSquare(int number)
{
	int a;
	float b;

	b=sqrt((double)number);
	a=b;

	if(a==b)
		return number;
	else
		return 0;
}

int main()
{
	int n,i,sum=0;
	scanf("%d",&n);
	int arr[n];

	for(i = 0; i < n; i++)
		scanf("%d",&arr[i]);

	for(i = 0; i < n; i++)
		sum = sum + PerfectSquare(arr[i]);
  
	printf("%d",sum);
	return 0;
}