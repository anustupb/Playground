#include<stdio.h>
int main()
{
  //fill your code
  int a[50],i,n,sum=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
    for(i=0;i<n;i++)
    {
      sum=sum+a[i];
    }
  printf("%d",sum);
  
  
}