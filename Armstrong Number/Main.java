#include <stdio.h>
int main()
{
    int number, original, remainder, result = 0;
    scanf("%d", &number);
    original = number;
    while (original!= 0)
    {
        remainder = original%10;
        result += remainder*remainder*remainder;
        original/= 10;
    }
    if(result == number)
        printf("Armstrong Number");
    else
        printf("Not Armstrong Number");
    return 0;
}