import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Concise {
    static List<Integer> numbers = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    public static void main(String[] args) {

        Optional<Integer> result = numbers.stream()
                .filter(Concise::isEven)
                .map(Concise::doubleIt)
                .reduce(Integer::sum);

        System.out.println(result);
    }

    private static int doubleIt(Integer number) {
        return number * 2;
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}

/*
It works.

It follows SLAP.

The details are not on your face.

Putem testa cu usurinta micile metode care compun functia.
*/
