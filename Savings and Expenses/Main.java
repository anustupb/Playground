#include<stdio.h>
int main()
{
  //fill your code
  int salary,bank,hostel,food,parents;
  scanf("%d%d%d%d%d", &salary,&bank,&hostel,&food,&parents);
  if(salary<bank+hostel+food+parents)
    printf("He has to work hard");
  else
    printf("He can save the money");
  
}