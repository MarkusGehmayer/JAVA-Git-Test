import java.util.Scanner;

public class Day02 {

    // A1
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Aufgabe 1 - Enter any number: ");
        n = s.nextInt();

        if (n > 0) {
            System.out.println("The number given " + n + " is positive");
        } else if (n < 0) {
            System.out.println("The number given " + n + " is negative");
        }

        // A2
        float m;
        System.out.print("Aufgabe 2 - Enter any number ");
        m = s.nextFloat();

        if (m == 0) {
            System.out.println("The number " + m + " is zero");
        } else if (m < 1) {
            if (m < 0) {
                System.out.println("The number " + m + " is negative");
            } else {
                System.out.println("The number " + m + " is positive small");
            }
        } else if (m > 1000000) {
            System.out.println("The number " + m + " is large positive");
        } else {
            System.out.println("The number " + m + " is positive");
        }

        // A3 a + b
        System.out.println("Aufgabe 3ab - Input a number: ");
            int day = s.nextInt();

            if (day == 1) {
                System.out.println("Today is Monday");
            } else if (day == 2) {
                System.out.println("Today is Tuesday");
            } else if (day == 3) {
                System.out.println("Today is Wednesday");
            } else if (day == 4) {
                System.out.println("Today is Thursday");
            } else if (day == 5) {
                System.out.println("Today is Friday");
            } else if (day == 6) {
                System.out.println("Today is Saturday");
            } else if (day == 7) {
                System.out.println("Today is Sunday");
            } else {
                System.out.println("Week has only 7 days");
            }

        // A3 c
        System.out.print("Aufgabe 3c - Input number: ");
        int daySwitch = s.nextInt();
        System.out.println(getDayName(daySwitch));
    }
         static String getDayName(int daySwitch) {
             String dayName = "";
             switch (daySwitch) {
                 case 1:
                     dayName = "Monday";
                     break;
                 case 2:
                     dayName = "Tuesday";
                     break;
                 case 3:
                     dayName = "Wednesday";
                     break;
                 case 4:
                     dayName = "Thursday";
                     break;
                 case 5:
                     dayName = "Friday";
                     break;
                 case 6:
                     dayName = "Saturday";
                     break;
                 case 7:
                     dayName = "Sunday";
                     break;
                 default:
                     dayName = "Week has only 7 days";
             }
             return dayName;
         }


    }


