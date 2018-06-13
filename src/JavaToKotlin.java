/**
 * Converting the Java to Kotlin.
 */
public class JavaToKotlin {
    public static void main(String[] args) {
        int day = 3;

        String dayStr = getDayForNum(day);
        System.out.println("Today is " + dayStr);
    }

    /**
     * Gets the corresponding day for the given number
     *
     * @param day @{@link String}
     * @return Day of the week.
     */
    private static String getDayForNum(int day) {
        // switch statement with int data type

        String dayString;
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
                break;
        }
        return dayString;
    }
}
