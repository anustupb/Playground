#include <stdio.h>
#include <string.h>

int main (void) {
   char string[100],temp;
   int i, j;
  gets(string); 
  int n = strlen(string);

   for (i = 0; i < n-1; i++)
   {
      for (j = i+1; j < n; j++)
      {
         if (string[i] > string[j])
         {
            temp = string[i];
            string[i] = string[j];
            string[j] = temp;
         }
      }
   }
   
   printf("The sorted string is %s \n", string);
   return 0;
}