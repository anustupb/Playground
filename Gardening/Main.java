#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  if(c%a==0&&c%b==0)
    printf("It is a mango tree");
    else
      printf("It is not a mango tree");
  return 0;
}