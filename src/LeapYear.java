public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean leapYear;
        if (year < 1 || year > 9999) {
            return false;
        }


        if (year % 4 != 0) {
            leapYear = false;
        } else if (year % 100 != 0) {
            leapYear = true;
        } else if (year % 400 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }


        return leapYear;
    }
}
