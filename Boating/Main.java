#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int sum;
  sum= 75*b+30*c;
  if(sum<a)
    printf("Boat is stable");
  else
    printf("Boat will drow");
  
}