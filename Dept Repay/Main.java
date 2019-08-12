#include<stdio.h>
int main()
{
  //fill your code
  float a,b,c;
  scanf("%f%f%f",&a,&b,&c);
  float i=(a*b*c)/100;
  float j=a+i;
  float k= 0.02*i;
  float l=j-k;
  printf("%0.2f\n%0.2f\n%0.2f\n%0.2f",i,j,k,l);
  return 0;
}