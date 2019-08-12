#include <stdio.h>
int main()
{
    int arr[100];
    int i, size, even=0, odd=0;
    scanf("%d", &size);

    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
  
    for(i=0; i<size; i++)
    {
        if(arr[i]%2 == 0)
            even++;
        else
            odd++;
    }
    printf("Odd: %d\n", odd);
    printf("Even: %d\n", even);
  
    return 0;
}