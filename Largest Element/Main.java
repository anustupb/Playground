#include<stdio.h>
int main()
{
  //fill your code
	int a[50],n,i,b,lag;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  b=a[0];
  for(i=0;i<n;i++)
  {
    if(b>a[i])
      lag=b;
    else
      b=a[i];
  }
  printf("%d",lag);
}