#include<stdio.h>
int main()
{
  //Fill your code
  int a=0,b=3,n,i;
  printf("Enter n value\n");
  scanf("%d",&n);
  printf("%d ",a);
  for(i=1;i<n;i++)
  {
    printf("%d ",a+b);
    a=a+b;
    b=b+2;
  }
}