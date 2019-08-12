#include<stdio.h>
int main()
{
  //fill your code
  float a,b,c,d;
  scanf("%f%f%f%f",&a,&b,&c,&d);
  float volume=3.14*a*a*b;
  if(volume<c*d)
 	printf("The tank can be filled within %0.1f hours",d);
  else
    printf("The tank cannot be filled within %0.1f hours",d);
  
}