package tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static HashMap<Character, List<String>> groupIt(List<String> arr) {
        HashMap<Character, List<String>> result = Arrays.asList("ABCA", "BCD", "ABC")
                .stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), HashMap::new, Collectors.toList()));
        return result;
    }
}
