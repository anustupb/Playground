#include<stdio.h>
int main()
{
char str1[100];
char str2[100];
gets(str1);
strcpy(str2, str1);
printf("The copied string is %s.", str2);
return 0;
}