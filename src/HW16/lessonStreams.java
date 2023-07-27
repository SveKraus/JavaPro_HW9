package HW16;

import java.util.*;
import java.util.stream.Collectors;

public class lessonStreams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "a2", "b4");
        String res = Collections.singleton(list.stream().findFirst().orElse("0")).toString();
        System.out.println(res);


        List<String> list2 = Arrays.asList("BigBen", "BiBob", "Big", "Ben", "Big Bob");
        Set<String> res2 = list2.stream().filter(s -> s.contains("Big")).collect(Collectors.toSet());

        System.out.println(res2);

        List<Integer> list3 = Arrays.asList(1, 12, 3, 10, 12, 17);
        List<Double> res3 = list3.stream().map(x -> (double) (x * 1.2)).toList();
        System.out.println(res3);

        List<Integer> list4 = Arrays.asList(1, 12, 3, 10, 12, 17);
        List<Integer> res4 = list4.stream().filter(x -> x % 2 != 0).toList();
        System.out.println(res4);

        List<String> list5 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> res5 = list5.stream().sorted((o1, o2) -> (-1)*o1.compareTo(o2)).distinct().collect(Collectors.toList());
        System.out.println(res5);

        List<Integer> list6 = Arrays.asList(7, 15, 88, 78, 20, 34);
        Integer res6 = list6.stream().reduce((x1,x2) -> x1+x2).get();
        Integer res7 = res6 / list6.size();

        System.out.println(res6);
        System.out.println(res7);

        List<String> persons = new ArrayList<>();
        persons.add(String.valueOf(new Person("Иван")));
        persons.add(String.valueOf(new Person("Андрей")));
        persons.add(String.valueOf(new Person("Сергей")));
        persons.add(String.valueOf(new Person("Владимир")));
        persons.add(String.valueOf(new Person("Анатолий")));

        String personsSort = persons.stream()
                .sorted((o1, o2) ->(-1)*o1.compareTo(o2)).distinct().collect(Collectors.toList()).toString();

        System.out.println(personsSort);

        List<String> text = Arrays.asList("Guten Tag", "Wie geht es dir", "Wie heissst du?", "Schoenen Tag!");

        List<String> uniqueWords = text.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).distinct().toList();
        System.out.println("Unique words - " + uniqueWords);

        long countWords = text.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).distinct().count();
        System.out.println("Count words - " + countWords);

        String longestWord = text.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).max(Comparator.comparing(String::length)).orElse("");
        System.out.println("Longest word - " + longestWord);

        List<String> newText = text.stream().sorted(Comparator.comparingInt(sentence -> sentence.split(" ").length)).sorted(Comparator.comparing(String::length).reversed()).toList();
        System.out.println("sorted List - " + newText);

    }
}