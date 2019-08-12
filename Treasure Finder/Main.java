#include <stdio.h>
int main()
{
   int a,b,c,hcf,st;
   
    scanf("%d %d %d", &a, &b, &c);
  
    if(a >= b && a >= c)
    {
        if(b >= c)
            printf("The treasure is in the box which has number %d.\n", b);
        else
            printf("The treasure is in the box which has number %d.\n", c);
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
            printf("The treasure is in the box which has number %d.\n",a);
        else
            printf("The treasure is in the box which has number %d.\n",c);
    }   
    else if(a >= b)
    {
        printf("The treasure is in the box which has number %d.\n", a);
    }
    else
    {
        printf("The treasure is in the box which has number %d.\n", b);
    }

    st=a<b?(a<c?a:c):(b<c?b:c);
 
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
	printf("The code to open the box is %d.",hcf);
}