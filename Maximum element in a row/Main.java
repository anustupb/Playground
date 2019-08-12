#include<stdio.h>

#define m 20

int main()
{

	int a[m][m],i,j=0,r,max[10],c;

	scanf("%d %d",&r,&c);
	for(i=0;i<r;i++)
	for(j=0;j<c;j++)
      scanf("%d",&a[i][j]);

  	for(i=0;i<r;i++)
	{
		max[i]=a[i][j];
		for(j=0;j<c;j++)
			if(a[i][j]>max[i])
				max[i]=a[i][j];
	}

		for(i=0;i<r;i++)
		printf("%d\n",max[i]);

}