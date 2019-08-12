#include<stdio.h>
int main()
{
  //fill your code
  int a,sum;
  scanf("%d",&a);
    sum=a%10;
    a=a/1000;
    sum=sum+a;
  printf("%d",sum);
  return 0;
    
}