import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Verbose {
    static List<Integer> numbers = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    public static void main(String[] args) {

        int result = 0;

        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0) {
                result += numbers.get(i) * 2;
            }
        }

        System.out.println(result);
    }
}

/*
It works
It is very familiar

It is complex - don't confuse familiar with simple
Fails SLAP - to know what it does, you have to know it all
All the details on your face all the time

Easy to write, but hard to read
It lacks empathy
*/
