#include<stdio.h>
 
int main()
{
    int i, j, rows, columns, a[10][10], Sum;
    scanf("%d %d", &i, &j);
  
    for(rows = 0; rows < i; rows++)
    {
        for(columns = 0; columns < j; columns++)
        {
            scanf("%d", &a[rows][columns]);
        }
    }
    for(columns = 0; columns < j; columns++)
      {
        Sum = 0;
          for(rows = 0; rows < i; rows++)
        {
            Sum = Sum + a[rows][columns];
        }
        printf("The sum of column %d: %d \n",columns+1, Sum );
    }
    
    return 0;
}