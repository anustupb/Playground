#include<stdio.h>
int main()
{
  //Fill your code
  int n,i,p1=1,p2=2,temp;
  printf("Enter n value\n");
  scanf("%d",&n);
  printf("%d %d ",p1,p2);
  for(i=2;i<n;i++)
  {
    printf("%d ",p1+p2);
    temp=p2;
    p2=p2+p1;
    p1=temp;
  }
    return 0;
}