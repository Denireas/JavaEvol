package Java13;

import org.junit.Test;

public class TextBlocks {

    @Test
    public void example4() {
        String html = "<html>\n" +
                "                 \t<body>\n" +
                "                   \t<p>Our little web page</p>\n" +
                "                 \t</body>\n" +
                "               \t<html>";

        String htmlWhichLooksBetter = """
                <html>
                      <body>
                         <p>Our little web page</p>
                         </body>
                <html>""";

        System.out.println(html);
        System.out.println(htmlWhichLooksBetter);

//        String wrong = """Hello""";
    }
}
