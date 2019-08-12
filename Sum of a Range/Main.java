#include<stdio.h>
int main()
{
  //fill your code
  int i,j,a,sum=0;
  scanf("%d%d",&i,&j);
    for(a=i;a<=j;a++)
    {
      sum=sum+a;
    }
  printf("%d",sum);
}