package strings;

import java.util.stream.Stream;

public class StringsJava11 {

    public static void main(String[] args) {

        //repeat(), repeats the string
        // strip(), remove leading and traiing spaces  it is aware of unicode characters
        //isBlank(),

      String stripExample ="\n\t  hello   \u2005".strip();
        System.out.println(stripExample);

//        String strip = stripExample.strip();// it is aware of unicode characters
//        System.out.println(strip);
        String trim = stripExample.trim();
        System.out.println(trim);


        String multilineStr = "This is\n \n a multiline\n string.";
        Stream<String> lines = multilineStr.lines();
        lines.forEachOrdered(s-> System.out.println(s));

    }
}
