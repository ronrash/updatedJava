package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ListSample {

    public static void main(String[] args) {
        System.out.println("hello");

        // this is an immutbale list,set and a map
        List<String> stringList = List.of("hello", "bye");
      //  stringList.add("rohit"); // throws an java.lang.UnsupportedOperationException

        List<String> list = List.of("apple", "banana", "orange");
        Set<Integer> set = Set.of(1, 2, 3);
        Map<String, Integer> map = Map.of("one", 1, "two", 2);

        System.out.println(map);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
       // introduction of the takeWhile and dropWhile methods,
        // which allow you to create a new stream that stops or continues when a certain condition is met.
        List<Integer> lessThan4 = numbers.stream().takeWhile(n -> n < 4).collect(Collectors.toList()); // [1, 2, 3]
        List<Integer> after3 = numbers.stream().dropWhile(n -> n < 4).collect(Collectors.toList());  // [4, 5, 6]

        System.out.println(lessThan4);


        // foreachordered
        List<Integer> newNUmbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);

        Employee emp1 = new Employee(1,"rohit");
        Employee emp2 = new Employee(1,"akaash");
        Employee emp3 = new Employee(1,"swati");


        List<Employee> employeeList = Arrays.asList(emp1, emp2, emp3);

        employeeList.stream().forEachOrdered(employee -> System.out.println(employee.getName()));

        // Using forEachOrdered to print numbers in order
        //

        numbers.parallelStream().forEachOrdered(number -> System.out.print(number + " "));

        // sort this
        employeeList.sort(Comparator.comparing(Employee::getName));
        System.out.println(employeeList);
    }
}

class Employee implements Comparable<Employee>{
    private int id;
    private String name;

    public Employee(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(final Employee employee) {
        return this.name.compareTo(employee.name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
