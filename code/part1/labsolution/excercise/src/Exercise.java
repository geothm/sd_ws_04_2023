import java.util.*;
import java.util.stream.Collectors;

public final class Exercise {
  public static String commaSeparatedNamesOfLength(List<String> names, int length) {
    final String DELIMITER = ",";
    return names.stream()
            .filter(name -> name.length() == length)
            .map(String::toUpperCase)
            .collect(Collectors.joining(DELIMITER));
  }

  public static double calculate(List<Integer> numbers) {
    return numbers.stream()
            .filter(Exercise::isEven)
            .filter(Exercise::isGreaterThan3)
            .filter(Exercise::checkSQRT)
            .mapToDouble(Exercise::doubleIt)
            .sum();
  }

  private static int doubleIt(Integer number) {
    return number * 2;
  }

  private static boolean checkSQRT(Integer number) {
    return Math.sqrt(number) < 3;
  }

  private static boolean isGreaterThan3(Integer number) {
    return number > 3;
  }

  private static boolean isEven(Integer number) {
    return number % 2 == 0;
  }

  public static void main(String[] args) {
    System.out.println(commaSeparatedNamesOfLength(Arrays.asList(
      "Tom", "Jerry", "Spike", "Tyke", "Butch"), 5));

    System.out.println(calculate(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 12)));
    
  }
}

