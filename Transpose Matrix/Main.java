#include <stdio.h>
 
int main()
{
   int m, c, d, matrix[20][20], transpose[20][20];
 
   scanf("%d", &m);
   
   for (c = 0; c < m; c++)
      for(d = 0; d < m; d++)
         scanf("%d", &matrix[c][d]);
 
   for (c = 0; c < m; c++)
      for( d = 0 ; d < m ; d++ )
         transpose[d][c] = matrix[c][d];
   
  for (c = 0; c < m; c++)
  { for(d = 0; d < m; d++)
       printf("%d ", matrix[c][d]);
  		printf("\n");
      } 
   printf("Transpose matrix is :\n");
 
   for (c = 0; c < m; c++)
   {
      for (d = 0; d < m; d++)
         printf("%d ", transpose[c][d]);
      printf("\n");
   }
 
   return 0;
}