#include<stdio.h>
int main()
{
  //fill your code
  int a,b,pow;
  scanf("%d%d",&a,&b);
  for(int i=1;i<=b;i++)
    pow=a*a;
  printf("%d",pow);
}