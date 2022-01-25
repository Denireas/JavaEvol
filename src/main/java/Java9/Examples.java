package Java9;

import org.junit.Test;

import java.util.List;

public class Examples {

    @Test
    public void example2() {
        List<String> list = List.of("name1", "name2", "name3");
        List<String> list2 = List.copyOf(list);
        for (String element : list2) {
            System.out.println(element);
        }
    }
}
