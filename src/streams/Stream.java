package streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        int[] d = {1, 2, 3, 4, 5, 8, 6, 7};

        List<Integer> a = new LinkedList();

        List<Integer> sum =
                Arrays.stream(d)

                        .filter((x) -> x % 2 == 0)
                        .map(x -> x * x)
                        .filter(x -> x > 7)
                        .boxed()
                        .collect(Collectors.toList());
        //.reduce(0,(previus,current)-> previus+current);
        //.forEach(System.out::println);


        System.out.println(sum);


    }
}
