#include<stdio.h>
int main()
{
  //fill your code
  float a,b;
  scanf("%f%f",&a,&b);
  b=b/100;
  float bmi=a/(b*b);
  if(bmi<18.5)
    printf("You are underweight. Have an apple daily.");
  else if(bmi>=18.5&&bmi<25)
    printf("You are normal. Go walking daily and maintain it.");
  else
    printf("You are obese. Go to doctor");
     
}