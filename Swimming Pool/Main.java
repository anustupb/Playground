#include<stdio.h>
int main()
{
  //fill your code
  int a,b;
  scanf("%d%d",&a,&b);
  int c=a*a*a*1000;
  if(c<b)
    printf("Cannot store");
  else
    printf("Can store");
}