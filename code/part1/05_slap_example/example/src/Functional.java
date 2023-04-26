import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Functional {
    static List<Integer> numbers = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    public static void main(String[] args) {

        Optional<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .reduce((a,b) -> a+b);

        System.out.println(result);
    }
}

/*
It works.

It's less complex. Focusul e pe elemente, nu pe parcurgerea listei.

Mai bun din perspectiva SLAP, but not great.

Less noisy, but we can do better.
*/
