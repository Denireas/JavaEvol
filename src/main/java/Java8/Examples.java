package Java8;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Examples {

    @Test
    public void example1() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("Sorting: " + names);

        Predicate<String> predicate = (s) -> s.length() > 3;
        predicate.test("tf");
        predicate.negate().test("tf");


        Function<String, Integer> toInteger = Integer::valueOf;
        toInteger.apply("23");

        Supplier<Cat> productSupplier = Cat::new;
        Cat vasya = productSupplier.get();
        Cat murzik = productSupplier.get();

        Consumer<String> printDouble = str -> System.out.println(str + ", " + str);
        System.out.print("Consumer test: ");
        printDouble.accept("YO");


        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());

        LocalTime now = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);
        System.out.println("zone1 < zone2 ? : " + now.isBefore(now2));

        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = tomorrow.minusDays(2);

        LocalDate xmas = LocalDate.parse("01.01.2022", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalTime midNight = LocalTime.parse("00:00");

    }

    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
