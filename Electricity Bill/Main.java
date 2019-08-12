#include<stdio.h>
int main()
{
  //fill your code
  float a,sum;
  scanf("%f",&a);
  if(a<=200)
    sum=a*0.5;
  else if(a>200&&a<=400)
    sum=a*0.65+100;
  if(a>400&&a<=600)
      sum=a*0.80+200;
  if(a>600)
    sum=a*1.25+425;
  printf("Rs.%0.0f",ceil(sum));
  return 0;
}