package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static tasks.FizzBuzzTask.fizzBuzzIt;
import static tasks.FlattingTask.flattingStrings;
import static tasks.GroupWordsTask.groupIt;
import static tasks.MapTask.mapping;

public class Main {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("1", "2", "dhf", "6gfg", "3");
        List<Integer> newArr = mapping(arr);//arr.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(newArr);
        List<String> newArr1 = flattingStrings(arr);
        System.out.println(newArr1);

        System.out.println(fizzBuzzIt(21));
        System.out.println(groupIt(arr));
    }
}
