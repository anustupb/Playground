#include <stdio.h>
 
int main()
{
    int number,n, i = 1;
    scanf("%d%d", &number,&n);
    while (i <= n)
    {
        printf("%d * %d = %d\n", number, i, number * i);
        i++;
    }
    return 0;
}