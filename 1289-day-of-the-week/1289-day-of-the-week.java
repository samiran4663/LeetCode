class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int prev_year=year-1;
        int count_of_years=(prev_year%400);
        int no_of_leap_years=(count_of_years/4 - count_of_years/100 +count_of_years/400);
        int no_of_ord_year=count_of_years-no_of_leap_years;
        int no_of_odd_days=(no_of_ord_year+(no_of_leap_years*2))%7;
        int [] days_of_month={31,28,31,30,31,30,31,31,30,31,30};
        if(isLeapYear(year)) days_of_month[1]=29;
        for(int i=1;i<month;i++)
        {
            no_of_odd_days+=days_of_month[i-1];
        }
        int total_days=(no_of_odd_days+day)%7;
        String [] days_of_week={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        return days_of_week[total_days];
       
    }
    public boolean isLeapYear(int year) {
        // Leap year if divisible by 4 and not divisible by 100,
        // or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}