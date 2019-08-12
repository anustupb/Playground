#include<stdio.h>
  
int main() 
{
        int mat[20][20],i,j,maxi[20],r,c;
        
        scanf("%d%d",&r,&c);
        for(i=0;i<r;i++)
                for(j=0;j<c;j++) 
                {
                  scanf("%d",&mat[i][j]);
                }
       
        for(i=0;i<c;i++) 
        {
                maxi[i] = mat[0][i];
                for(j=0;j<3;j++)
                     if(maxi[i] < mat[j][i])
                        maxi[i] = mat[j][i];
        }
     
        for(i=0;i<3;i++)
                printf("%d\n",maxi[i]);
        return 0;
}