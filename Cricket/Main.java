#include<stdio.h>
int main()
{
  //Fill your code
  float total_balls,total_runs,runs_scored; 
  int balls_bowled;
  scanf("%f%f%f%d",&total_balls,&total_runs,&runs_scored,&balls_bowled);
  float total_overs,overs_finished,current_run_rate,run_rate;
  total_overs=total_balls/6;
  overs_finished=(balls_bowled/6)+0.1*(balls_bowled%6);
  current_run_rate=runs_scored/overs_finished;
  run_rate=total_runs/50;
printf("%0.0f\n%0.1f\n%0.1f\n%0.1f",total_overs,overs_finished,current_run_rate,run_rate);
  if(current_run_rate>run_rate)
    printf("\nEligible to Win");
  else 
    printf("\nNot Eligible to Win");
  return 0;
}