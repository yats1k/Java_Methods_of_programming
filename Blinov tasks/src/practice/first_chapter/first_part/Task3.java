package practice.first_chapter.first_part;


import java.util.Scanner;

/*
Вывести заданное количество случайных чисел с переходом и без  перехода на новую строку
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity;
        int[] randomNumbers;
        if (scanner.hasNext()) {
            quantity = scanner.nextInt();
            randomNumbers = new int[quantity];
            fillNumbers(randomNumbers);
            singleLinePrint(randomNumbers);
            newLineResult(randomNumbers);
        }
    }

    /**
     * Print array elements from a new line.
     *
     * @param randomNumbers array of numbers
     */
    private static void newLineResult(int[] randomNumbers) {
        System.out.println("\nNew line result: ");
        for (int randomNumber : randomNumbers) {
            System.out.println(randomNumber);
        }
    }

    /**
     * Print array elements in a single line.
     *
     * @param randomNumbers array of numbers
     */
    private static void singleLinePrint(int[] randomNumbers) {
        System.out.print("Single line result: ");
        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber + " ");
        }
    }

    /**
     * Fills array with random numbers.
     *
     * @param randomNumbers empty array to fill
     */
    private static void fillNumbers(int[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 50);
        }
    }
}
