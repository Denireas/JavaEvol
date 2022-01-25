package Java14;

public record Cat (String name, Integer tailLength) {
    static int minAge;
    static{
        minAge = 18;
        System.out.println("Static initializer");
    }
}
