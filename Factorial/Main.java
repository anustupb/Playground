#include<stdio.h>
int main()
{
  //fill your code
  int i,n,fact=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
    fact=fact*i;
  printf("%d",fact);
  
}