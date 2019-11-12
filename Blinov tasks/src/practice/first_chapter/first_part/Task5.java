package practice.first_chapter.first_part;

import java.util.Arrays;

/*
Ввести целые числа как аргументы командной строки, подсчитать их суммы(произведения) и вывести результат
 */
public class Task5 {

    public static void main(String[] args) {
        int sum = 0;
        int multiplication = 0;
        System.out.println("Entered numbers: " + Arrays.asList(args).toString());

        multiplication = getMultiplication(args, multiplication);
        System.out.println("Sum of numbers: " + multiplication);

        sum = getSum(args, sum);
        System.out.println("Numbers multiplication: " + sum);
    }

    /**
     * Get multiplication of numbers.
     *
     * @param args array of numbers
     * @param multiplication int = 1 default start value
     * @return int result
     */
    private static int getMultiplication(String[] args, int multiplication) {
        if(multiplication == 0){
            multiplication = 1;
        }
        for (String arg : args) {
            multiplication = multiplication * Integer.parseInt(arg);
        }
        return multiplication;
    }

    /**
     * Get sum of numbers.
     *
     * @param args array of numbers
     * @param sum int = 0 default start value
     * @return int result
     */
    private static int getSum(String[] args, int sum) {
        for (String arg : args) {
          sum += Integer.parseInt(arg);
        }
        return sum;
    }
}
