package streams;

import java.util.List;

public class SampleStream01 {
    public static void main(String[] args) {

        List<String> stringList = List.of("abc", "oranges", "apples");

        boolean hasApplesInList = stringList.stream().anyMatch(s -> s.equals("apples"));

        System.out.println(hasApplesInList);

    }
}
