#include<stdio.h>
int main()
{
char str1[100];
char str2[100];
gets(str1);
  gets(str2);
if (strcmp(str1,str2) == 0)
printf("Strings are same\n");
   else
      printf("Strings are not same\n");
return 0;
}