#include<stdio.h>
int main()
{
  //fill your code
  int a;
  scanf("%d",&a);
  int years,weeks,days;

    years=a/365;
    a=a%365;
    weeks=a/7;
    a=a%7;
    days=a;
  printf("%d \n%d \n%d",years,weeks,days);
  return 0;
}