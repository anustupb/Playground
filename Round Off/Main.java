#include<stdio.h>
int main()
{
  //fill your code
  float a;
  scanf("%f",&a);
  float b=ceil(a);
  float c=floor(a);
  printf("%.0f\n",c);
  printf("%.1f\n",b);
  printf("%.1f",a-0.5);
return 0;
}
