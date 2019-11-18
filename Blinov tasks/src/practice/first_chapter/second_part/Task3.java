package practice.first_chapter.second_part;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Precondition for all package: Ввести с консоли n целых чисел. На консоль вывести:

Четные которые делятся на 3 и 9
 */
public class Task3 {

    public static void main(String[] args) {
        //read data from console
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("Input can't be empty.");
            input = scanner.nextLine();
        }

        //write entered string to array
        String[] array = input.split("\\D+");
        if (array.length > 0 && isAllInteger(array)) {
            //get max value from array
            List<Integer> integers = Stream.of(array).map(Integer::valueOf).filter(module()).collect(Collectors.toList());
            int[] result = integers.stream().mapToInt(Integer::intValue).toArray();
            System.out.println("Result: " + Arrays.toString(result));
        } else {
            System.out.println("The string contains letters.");
        }
    }

    /**
     * Check does this array contains only numbers.
     *
     * @param array String array
     * @return boolean
     */
    private static boolean isAllInteger(String[] array) {
        return Arrays.stream(array).allMatch(e -> e.matches("\\d+"));
    }

    /**
     * Predicate that check integer condition (even, int%3=0, int%9=0).
     *
     * @return coincidences
     */
    private static Predicate<Integer> module() {
        return p -> p % 2 == 0 && p % 3 == 0 && p % 9 == 0;
    }
}
