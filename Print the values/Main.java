#include<stdio.h>
int main()
{
  //fill your code
  int n,a[50];
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n;i++)
  {
    printf("%d\n",a[i]);
  }
}