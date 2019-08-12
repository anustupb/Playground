#include<stdio.h>
int main()
{
  //fill your code
  char a[50];
  float b;
  int c,d;
  scanf("%s",&a);
  scanf("%d%f%d",&c,&b,&d);
  printf("%s\n",a);
  printf("%d\n",c);
  if(b>=7.0&&d==0||d==1)
  {
    printf("Eligible to attend placement\n");
    
  }
  else if(b>=7.5&&d==1||d==2||d==0);
   
 
     printf("Not Eligible to attend placement");
}