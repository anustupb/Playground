#include <stdio.h>
int main()
{
    char line[150];
    int i, vowels, consonants, digits, spaces,characters;
    vowels =  consonants = digits = spaces = characters= 0;
    scanf("%[^\n]", line);
    for(i=0; line[i]!='\0'; ++i)
    {
        if(line[i]=='a' || line[i]=='e' || line[i]=='i' ||
           line[i]=='o' || line[i]=='u' || line[i]=='A' ||
           line[i]=='E' || line[i]=='I' || line[i]=='O' ||
           line[i]=='U')
        {
            ++vowels;
        }
        else if((line[i]>='a'&& line[i]<='z') || (line[i]>='A'&& line[i]<='Z'))
            ++consonants;
        else if(line[i]>='0' && line[i]<='9')
            ++digits;
        else if (line[i]==' ')
            ++spaces;
      	else 
          	++characters;
    }
    printf("Vowels:%d",vowels);
    printf("\nConsonants:%d",consonants);
    printf("\nWhite Spaces:%d", spaces);
    printf("\nDigits:%d",digits);
  	 printf("\nSymbols:%d",characters);
    return 0;
}