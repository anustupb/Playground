#include<stdio.h>
int main()
{
  //fill your code
  float x1,x2,x3,y1,y2,y3;
  scanf("%f%f%f%f%f%f",&x1,&y1,&x2,&y2,&x3,&y3);
  printf("%0.1f\n%0.1f",(x1+x2+x3)/3.0,(y1+y2+y3)/3.0);
  return 0;
}