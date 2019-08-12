#include<stdio.h>
#include<math.h>
int main()
{
  //Fill your code
  long int n,i,a;
  printf("Enter n value\n");
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
  {
    a=pow(i,i);
    printf("%ld ",a);
  }
}