package practice.first_chapter.first_part;

import java.util.Arrays;

/*
Отобразить в окне консоли аргументы командной строки в обратном порядке
 */
public class Task2 {

    public static void main(String[] args) {
        //Print args values in initial order
        System.out.println(Arrays.asList(args).toString());
        //Print args values in reverse order
        for (int i = args.length - 1; i >= 0; i--)
            System.out.println("Reverse order : " + args[i]);
    }
}
