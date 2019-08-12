#include<stdio.h>
int main()
{
  //fill your code
  int i,n,a[50];
  scanf("%d",&n);
 	while(n!=0)
    {
      a[i]=n%2;
      n=n/2;
      i++;
    }
  for(int j=i-1;j>=0;j--)
  printf("%d",a[j]);
}