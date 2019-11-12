package practice.first_chapter.first_part;

import java.util.Scanner;

/*
Ввести пароль из командной строки и сравнить его со строкой образцом
 */
public class Task4 {

    /**
     * Password to compare
     */
    private final static String PASSWORD_TEMPLATE = "default";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a password to verify: ");
        if (scanner.hasNext()) {
            String password = scanner.nextLine();
            boolean result = password.equals(Task4.PASSWORD_TEMPLATE);
            if (result) {
                System.out.println("Passwords are the same.");
            } else
                System.out.println("Passwords are not the same.");
        }
    }
}
