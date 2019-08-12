#include<stdio.h>
#include<math.h>
int main()
{
  //fill your code
  int x,y;
  scanf("%d%d",&x,&y);
  int distance=pow(pow((x-3),2)+pow((y-4),2),0.5);
 printf("%d",distance);
}