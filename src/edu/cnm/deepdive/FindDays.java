package edu.cnm.deepdive;

public class FindDays {

  public static int daysElapsed(int day, int month, int year) {

    /*
    Normalization: we may be given bad input of say, (-57, 12, 2017) converts to
    (4,11,2017)
     */

    /*
    Leap year method. 1+(1970/4)-(1970/100) + (1970/400)
     */

    final int STANDARD_DAYS_YEAR = 365;
    final int GROUND_ZERO = 1970;
    int days = 0;

    int yearDays = (year - GROUND_ZERO) * STANDARD_DAYS_YEAR;
    days += yearDays + monthDays(month) + day;

    System.out.println(days);
    return days;

  }

  private static int monthDays(int month) {
    int days = month * 30;
    return days;
  }

  private static boolean isLeapYear(int year) {
    return ((year % 4 == 0) && (year % 100 != 100 || year % 400 == 0));
  }


  public static void main(String[] args) {

    daysElapsed(2, 1, 1970);
    daysElapsed(2, 11, 1969);

  }
}