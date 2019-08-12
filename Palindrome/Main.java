#include <stdio.h>
int main()
{
    int n, reverse = 0, remainder, original;
    scanf("%d", &n);
    original = n;
    while( n!=0 )
    {
        remainder = n%10;
        reverse = reverse*10 + remainder;
        n /= 10;
    }
    if (original== reverse)
        printf("Same");
    else
        printf("Not Same");
    
    return 0;
}