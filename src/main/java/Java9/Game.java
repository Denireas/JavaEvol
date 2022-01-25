package Java9;

import java.lang.annotation.Repeatable;

//@Repeatable(Games.class)
public @interface Game {
    String name() default "Что-то под вопросом";
    String day();
}
