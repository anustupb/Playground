#include<stdio.h>
int main()
{
  //fill your code
  int l,b,lp1,bp1,lp2,bp2;
  scanf("%d%d%d%d%d%d",&l,&b,&lp1,&bp1,&lp2,&bp2);
  int ap1,ap2,a;
  a=l*b;
  ap1=lp1*bp1;
  ap2=lp2*bp2;
  if(ap1+ap2<a)
    printf("Raj can fix both painting");
  else
    printf("Raj cannot fix both painting");
}