package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object

        GregorianCalendar myCal = new GregorianCalendar();
        GregorianCalendar bDay = new GregorianCalendar(2002, 7, 7);
        GregorianCalendar bDay2020 = new GregorianCalendar(2020, 7, 7);
        GregorianCalendar today = new GregorianCalendar(2020, 9, 24);

        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument


             //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.

        int month = myCal.get(Calendar.MONTH);
        int dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH);
        int year = myCal.get(Calendar.YEAR);
        int dayOfWeek = myCal.get(Calendar.DAY_OF_WEEK);

        System.out.println(" ");
        System.out.println("Today's Date: " + (month + 1) + ", " + dayOfMonth + ", " + year);
        System.out.println(" ");
        System.out.println("myCal Month: " + (month + 1));
        System.out.println("myCal Day of Month: " + dayOfMonth);
        System.out.println("myCal Year: " + year);
        System.out.println("myCal Day of Week: " + dayOfWeek);

        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html

        myCal.add(Calendar.DAY_OF_YEAR, 100);

        month = myCal.get(Calendar.MONTH);
        dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH);
        year = myCal.get(Calendar.YEAR);
        dayOfWeek = myCal.get(Calendar.DAY_OF_WEEK);

        System.out.println(" ");
        System.out.println("Today's Date 100 Days From Now: " + (month + 1) + ", " + dayOfMonth + ", " + year);

         System.out.println(" ");
         System.out.println("myCal Month 100 Days From Now: " + (month + 1));
         System.out.println("myCal Day of Month 100 Days From Now: " + dayOfMonth);
         System.out.println("myCal Year 100 Days From Now: " + year);
         System.out.println("myCal Day of Week 100 Days From Now: " + dayOfWeek);

         int birthdayMonth = bDay.get(Calendar.MONTH);
         int birthdayDayOfMonth = bDay.get(Calendar.DAY_OF_MONTH);
         int birthdayYear = bDay.get(Calendar.YEAR);
         int birthdayDayOfWeek = bDay.get(Calendar.DAY_OF_WEEK);

         System.out.println(" ");
         System.out.println("My Birthday: " + (birthdayMonth + 1) + ", " + birthdayDayOfMonth + ", " + birthdayYear);
         System.out.println("Weekday of My Birthday: " + birthdayDayOfWeek);

        bDay2020.add(Calendar.DAY_OF_YEAR, 10000);

        int birthdayMonth2020 = bDay2020.get(Calendar.MONTH);
        int birthdayDayOfMonth2020 = bDay2020.get(Calendar.DAY_OF_MONTH);
        int birthdayYear2020 = bDay2020.get(Calendar.YEAR);
        int birthdayDayOfWeek2020 = bDay2020.get(Calendar.DAY_OF_WEEK);

        System.out.println(" ");
        System.out.println("Date 10000 Days After My 2020 Birthday: " + (birthdayMonth2020 + 1) + ", " + (birthdayDayOfMonth2020) + ", " + (birthdayYear2020));
        System.out.println("Day of Week 10000 Days After My 2020 Birthday: " + birthdayDayOfWeek2020);

        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)


    }

}