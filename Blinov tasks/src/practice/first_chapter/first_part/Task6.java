package practice.first_chapter.first_part;

/*
Вывести фамилию разработчика, дату получения задания, а также дату и время сдачи
 */
public class Task6 {

    private static final String AUTHOR = "yats1k";
    private static final String DATE = "11/12/2019";

    public static void main(String[] args) {
        System.out.println(String.format("Author: %s1\nDate: %s2", Task6.AUTHOR, Task6.DATE));
    }
}
