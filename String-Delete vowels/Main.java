#include <stdio.h>
#include<string.h>
int vowel(char);
int main()
{
	char s[100], t[100];
	int i, j=0;
	gets(s);
	for(i= 0; s[i] != '\0'; i++)
		{
			if(vowel(s[i]) == 0)
			{
				t[j] = s[i];
				j++;
			}		
		}
		t[j] = '\0';
		strcpy(s, t);
		printf("%s\n", s);
		return 0;
}

int vowel(char ch)
	{
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I'
            || ch =='o' || ch=='O' || ch == 'u' || ch == 'U')
			return 1;
		else
			return 0;
}