#include <stdio.h>

int main()
{
  int array[100],n,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&array[i]);
  int unique = 1; 
  for(i = 0; i <n-1; i++)
    {
     if(array[i]==array[i+1])
       continue;
     else
       unique++;
    }
 printf("There are %d distinct elements in the array.",unique);
  return 0;
}