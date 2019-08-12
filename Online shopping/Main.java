#include<stdio.h>
int main()
{
  //fill your code
  int a1,a2,a3,b1,b2,b3,c1,c2,c3;
  scanf("%d%d%d%d%d%d%d%d%d",&a1,&a2,&a3,&b1,&b2,&b3,&c1,&c2,&c3);
  int p1,p2,p3,q1,q2,q3;
  p1=(a1*a2/100);
  q1=a1-p1+a3;
  p2=(b1*b2/100);
  q2=b1-p2+b3;
  p3=(c1*c2/100);
  q3=c1-p3+c3;
  printf("In Flipkart: Rs.%d\n",q1);
  printf("In Snapdeal: Rs.%d\n",q2);
  printf("In Amazon: Rs.%d\n",q3);
  if(p1<p2&&p2<p3)
      printf("He will prefer Flipkart");
  else {
            if(p2 > p3)
                 printf("He will prefer Snapdeal");
                 else
                 printf("He will prefer Amazon ");
                 }
  
}