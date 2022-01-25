package Java14;

import lombok.Data;

@Data
public class Violin implements Instrument {
    private static String name = "Violin";
    private Person owner;

    @Override
    public String toString() {
        return name;
    }
}
