import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class lessonStreams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "a2", "b4");
        Set<String> res = Collections.singleton(list.stream().findFirst().orElse("0"));
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
        List<String> res5 = list5.stream().sorted(((o1, o2) -> (-1)*o1.compareTo(o2))).distinct().collect(Collectors.toList());
        System.out.println(res5);
    }
}
