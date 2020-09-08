package task_1;
 /* Ввести целое число в консоли и вывести на экран
последнюю цифру введенного числа */

import java.util.Scanner;

public class task_1 {
    public static void main (String[] args) {
        System.out.println("Введите любое целое число: ");
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int lastInt = inputValue % 10;
        System.out.println("Последняя цифра введенного числа: " + lastInt);
    }
}