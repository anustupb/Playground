#include <stdio.h>
#include <math.h>
 
int isPerfectSquare(int x)
{
    int s = sqrt(x);
    if(s*s == x)
        return 1;
    else
        return 0;
}
 
int isFibonacci(int n)
{
    if(isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4))
        return 1;
    else
        return 0;
}

int main(void)
{
    int i;
   	scanf("%d",&i);
    
        if(isFibonacci(i))
            printf("Fibonacci Number \n");
        else
            printf("Not Fibonacci Number \n");
    
    return 0;
}