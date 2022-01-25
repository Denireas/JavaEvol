package Java12;

import org.junit.Test;

public class Switch {
    @Test
    public void example3() {
        String dayOfWeek = "MONDAY";
        int numberOfLetter = 0;
        switch(dayOfWeek) {
            case "MONDAY":
            case "FRIDAY":
            case "SUNDAY":
                numberOfLetter = 6;
                break;
            case "TUESDAY":
                numberOfLetter = 7;
                break;
            case "THURSDAY":
            case "SATURDAY":
                numberOfLetter = 8;
                break;
            case "WEDNESDAY":
                numberOfLetter = 9;
                break;
            default:
                throw new IllegalStateException("Wrong name of day");
        }
        System.out.println(numberOfLetter);

        switch (dayOfWeek) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> System.out.println(6);
            case "TUESDAY" -> System.out.println(7);
            case "THURSDAY", "SATURDAY" -> System.out.println(8);
            case "WEDNESDAY" -> System.out.println(9);
        }

        int numberOfLetters = switch (dayOfWeek) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default ->  throw new IllegalStateException("Wrong name of day");
        };
        System.out.println(numberOfLetters);

    }
}
