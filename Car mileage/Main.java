#include<stdio.h>
int main()
{
  //Fill your code
  float m,p,d;
  scanf("%f %f %f",&m,&p,&d);
  if(m*p>d)
    printf("Can reach");
  else
    printf("Cannot reach");
  return 0;
}