#include<stdio.h>
int main()
{
  //Fill your code
  char ch[50];
  int a,b,c;
  scanf("%s",&ch);
  scanf("%d%d%d",&a,&b,&c);
  if(a<c)
    printf("Out of stock");
  else
    printf("The amount of %d %s is %d\nRemaining number of %s present in stock:%d",c,ch,b*c,a-c);
  	
}