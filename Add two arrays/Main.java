#include<stdio.h>
void main()
{
 int i,a[5],b[5],c[5],n;
  scanf("%d",&n);
 
 for (i=0;i<n;i++)
   scanf("%d",&a[i]);
 
 for (i=0;i<n;i++)
   scanf("%d",&b[i]);
 
   for(i=0;i<n;i++)
     {
     c[i]=a[i]+b[i];
     printf("%d ",c[i]);
     }
}