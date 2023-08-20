package strings;

import java.util.ArrayList;
import java.util.List;

public class StringBufferAndBuilder {
    //To address the limiations of the immutable String class,
    // Java provides two other classes: StringBuilder and StringBuffer.
    // These classes are designed for efficient string manipulation and dynamic content creation

//    StringBuilder
//    This is an unsynchronized, mutable sequence of characters.
//    It is designed for single-threaded scenarios where performance is crucial.
//    With StringBuilder, you can append, insert or delete characters within the same object,
//    avoiding the need to create multiple intermediate string objects. Good for dynamic string construction and concatenation.

    public static void main(String[] args) {
        StringBuilder sentenceBuilder = new StringBuilder();
        sentenceBuilder.append("This");
        sentenceBuilder.append(" is");
        sentenceBuilder.append(" a");
        sentenceBuilder.append(" StringBuilder");
        sentenceBuilder.append(" example.");

        String sentence = sentenceBuilder.toString();
        System.out.println(sentence);

        List<String> items = new ArrayList<>();
        items.add("apple");
        items.add("banana");
        items.add("orange");
        items.add("grape");

        StringBuilder csvBuilder = new StringBuilder();

        for (String item : items) {
            if (csvBuilder.length() > 0) {
                csvBuilder.append(", ");
            }
            csvBuilder.append(item);
        }

        String csvString = csvBuilder.toString();
        System.out.println("Comma-separated list: " + csvString);
    }
}
