#include <stdio.h>
 
void lower_string(char []);
 
int main()
{
   char string[100];
   gets(string);
   lower_string(string);
   printf("String with lowercase is %s\n", string);
   return 0;
}
 
void lower_string(char s[]) {
   int c = 0;
   
   while (s[c] != '\0') {
      if (s[c] >= 'A' && s[c] <= 'Z') {
         s[c] = s[c] + 32;
      }
      c++;
   }
}