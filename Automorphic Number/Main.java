int main()
{
    int num, sqr, temp, last;
    int n =0;
 
    scanf("%d",&num);
 
    sqr = num*num; 
    temp = num;
 
    while(temp>0)
    {
        n++;
        temp = temp/10;
    }
 
    //Extracting last n digits
    int den = floor(pow(10,n));
    last = sqr % den;
 
    if(last == num)
        printf("Automorphic Number \n");
    else
        printf("Not Automorphic Number \n");
 
    return 0;
}