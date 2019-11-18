package practice.first_chapter.second_part;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/*
Precondition for all package: Ввести с консоли n целых чисел. На консоль вывести:

Наибольшее и наименьшее число
 */
public class Task2 {

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
            int maxValue = Stream.of(array).map(Integer::valueOf).max(Integer::compare).get();
            System.out.println("Max value = " + maxValue);
            int minValue = Stream.of(array).map(Integer::valueOf).min(Integer::compare).get();
            System.out.println("Min value = " + minValue);
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
}
