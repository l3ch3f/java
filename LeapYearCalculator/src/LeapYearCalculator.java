public class LeapYearCalculator {

    public static boolean isLeapYear (int year) {

        if (year >= 1 || year <= 9999) {
            int step1 = year / 4;
            int step2 = step1 / 100;
            int step3 = step2 / 400;

            if (step3 == 366) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            System.out.println("invalid Value");
            return false;
        }
    }
}
