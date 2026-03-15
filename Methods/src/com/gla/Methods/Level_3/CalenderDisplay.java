package com.gla.Methods.Level_3;


class CalendarDisplay {
    static String[] monthNames = {"January","February","March","April","May","June",
            "July","August","September","October","November","December"};
    static int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static String getMonthName(int month) { return monthNames[month - 1]; }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        return (month == 2 && isLeapYear(year)) ? 29 : daysInMonth[month - 1];
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1, m = month, y = year;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + 31 * m0 / 12) % 7;
    }

    public static void displayCalendar(int month, int year) {
        System.out.println(getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDayOfMonth(month, year);
        int totalDays = getDaysInMonth(month, year);
        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        displayCalendar(7, 2005);

    }
}

