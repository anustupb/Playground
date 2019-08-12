#include<stdio.h>
#include<math.h>
int main()
{
  //fill your code
  float a,b;
  scanf("%f%f",&a,&b);
  float wcf;
  wcf=35.74+0.6215*a+(0.4275*a-35.75)*pow(b,0.16);
  printf("%0.2f",wcf);
}