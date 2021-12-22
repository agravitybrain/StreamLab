package tasks;

import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mapping(List<String> arr) {
        return (List<Integer>) arr.stream()
                .filter(x -> x.matches("^-{0,1}[0-9]{1,}"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
