#include<stdio.h>
int main()
{
  //fill your code
  float p1,p2,d;
  scanf("%f%f%f",&p1,&p2,&d);
  float total,discount,saving;
  total=p1+p2;
  discount=(d/100)*total;
  saving=total-discount;
  printf("%0.2f\n%0.2f\n%0.2f", total,saving,discount);
  return 0;
}