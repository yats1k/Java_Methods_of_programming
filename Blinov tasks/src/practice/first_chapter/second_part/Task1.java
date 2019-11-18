package practice.first_chapter.second_part;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Precondition for all package: Ввести с консоли n целых чисел. На консоль вывести:

Четные и не четные числа
 */
public class Task1 {

    public static void main(String[] args) throws Throwable {
        //read data
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("Input can't be empty.");
            input = scanner.nextLine();
        }

        //write entered string to array
        String[] array = input.split("\\D+");
        for (String string : array) {
            System.out.println(string);
        }

        //collect result
        List odd = collectOddNumbers(array);
        List even = collectEvenNumbers(array);

        //print result
        if(odd.isEmpty() && even.isEmpty()){
            System.out.println("Nothing is founded.");
            System.exit(0);
        }
        System.out.println(odd.toString());
        System.out.println(even.toString());
    }

    /**
     * Get even numbers from the array
     *
     * @param arrayOfNumbers array to find
     * @return list of results
     */
    private static List<String> collectEvenNumbers(String[] arrayOfNumbers) {
        return Arrays.stream(arrayOfNumbers).filter(string -> (Integer.parseInt(string)) % 2 == 0).collect(Collectors.toList());
    }

    /**
     * Get odd numbers from the array
     *
     * @param arrayOfNumbers array to find
     * @return list of results
     */
    private static List<String> collectOddNumbers(String[] arrayOfNumbers) {
        return Arrays.stream(arrayOfNumbers).filter(string -> (Integer.parseInt(string)) % 2 != 0).collect(Collectors.toList());
    }
}
