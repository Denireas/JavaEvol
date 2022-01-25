package Java14;

import org.junit.Test;

public class Examples {

    @Test
    public void example5() {
        Cat cat = new Cat("vasya", 10);
        System.out.println(cat);
        System.out.println(cat.name());
        System.out.println(cat.tailLength());

        Object object = new Violin();

        //old
        if (object instanceof Instrument) {
            Instrument instrument = (Instrument) object;
            System.out.println(instrument);
        }

        //new
        if (object instanceof Instrument instrument){
            System.out.println(instrument);
        }

        // THANKS FOR TELLING ME WHERE
//        Violin violin = new Violin();
//        System.out.println(violin.getOwner().name());
    }
}
