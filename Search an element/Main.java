#include <stdio.h>
int main()
{
    int arr[100];
    int size, i, toSearch, found;

    scanf("%d", &size);

    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    scanf("%d", &toSearch);
    found = 0; 
    
    for(i=0; i<size; i++)
    {
        if(arr[i] == toSearch)
        {
            found = 1;
            break;
        }
    }

    if(found == 1)
        printf("%d is present in the array", toSearch);
    else
        printf("%d is not present in the array", toSearch);

    return 0;
}