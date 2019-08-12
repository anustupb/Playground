#include<stdio.h>
int main()
{
  //fill your code
  float gold,s1,s2;
  scanf("%f%f%f",&gold,&s1,&s2);
  float a,b,c;
  a=(s1/100)*gold;
  b=(s2/100)*(gold-a);
  c=((100-s2)/100)*(gold-a);
  printf("%0.0f\n%0.0f\n%0.0f",floor(a),b,c/3);
  return 0;
  
}