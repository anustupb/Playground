#include<stdio.h>
int main()
{
  //fill your code scanf("%d",&a);
  int a,b;
  scanf("%d%d",&a,&b);
  switch(a)
  {
    case 1: printf("Number of days is 31");
  			break;
  case 2:if(b%4==0||b%100&&b%400==0) 
      printf("Number of days is 29");
      else
        printf("Number of days is 28");
      	break;
  case 3: printf("Number of days is 31");
      break;
  case 4: printf("Number of days is 30");
      break;
  case 5: printf("Number of days is 31");
      	break;
  case 6: printf("Number of days is 30");
      break;
  case 7: printf("Number of days is 31");
      break;
  case 8: printf("Number of days is 31");
      break;
  case 9: printf("Number of days is 30");
      break;
        case 10: printf("Number of days is 31");
      break;
        case 11: printf("Number of days is 30");
      break;
        case 12: printf("Number of days is 31");
      break;
    default:
    printf("Invalid Input");
  }
  
}