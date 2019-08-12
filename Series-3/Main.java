#include<stdio.h>
int main()
{
  //Fill your code
  int n,i,a=6,b=3;
  printf("Enter n value\n");
  scanf("%d",&n); 
  printf("%d ",a);
  for(i=1;i<n;i++)
  {
    printf("%d ",a+b);
    a=a+b;
    b=b+2;
}
}