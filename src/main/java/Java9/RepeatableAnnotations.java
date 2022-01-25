package Java9;

@Games({
        @Game(name = "Крикет",  day = "воскресенье"),
        @Game(day = "четверг"),
        @Game(name = "Хоккей",   day = "понедельник")
})
public class RepeatableAnnotations {
    public static void main(String[] args) {
        Games games = RepeatableAnnotations.class.getAnnotation(Games.class);

        for (Game game : games.value()) {
            System.out.println(game.name() + " в " + game.day());
        }
    }
}
