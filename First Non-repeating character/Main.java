#include<stdlib.h> 
#include<stdio.h> 
#define NO_OF_CHARS 256 
  
int *getCharCountArray(char *str) 
{ 
   int *count = (int *)calloc(sizeof(int), NO_OF_CHARS); 
   int i; 
   for (i = 0; *(str+i);  i++) 
      count[*(str+i)]++; 
   return count; 
} 
 
int firstNonRepeating(char *str) 
{ 
  int *count = getCharCountArray(str); 
  int index = -1, i; 
  
  for (i = 0; *(str+i);  i++) 
  { 
    if (count[*(str+i)] == 1) 
    { 
      index = i; 
      break; 
    }    
  }   
    
  free(count); 
  return index; 
} 
  

int main() 
{ 
  char str[100];
  scanf("%s",str);
  int index =  firstNonRepeating(str); 
  if (index == -1)   
    printf("Error"); 
  else
   printf("%c", str[index]); 
  getchar(); 
  return 0; 
}