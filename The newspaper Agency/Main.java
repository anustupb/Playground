#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  
  int sum = (a*b)-(a*c)-100;
  printf("%d",sum);
  return 0;
}