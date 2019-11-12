package practice.first_chapter.first_part;

import java.util.Scanner;

/*
*Поприветствовать любого пользователя при вводе его имени через командную строку
*/
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую тебя, " + scanner.next());
    }
}
