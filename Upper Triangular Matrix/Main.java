#include <stdio.h>

int main()
{
    int n,i,j;
    scanf("%d",&n);
    int flag = 0;
    int mat[n][n];
    
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n; j++)
        scanf("%d",&mat[i][j]);
    }

        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (mat[i][j] != 0)
                    flag = 0;
                else
                    flag = 1;

        if (flag == 1)
            printf("Upper triangular matrix");
        else
            printf("Not an Upper triangular matrix");
return 0;
}