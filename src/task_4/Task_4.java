package task_4;

/*
Ввести целое число в консоли. Если оно является
положительным, то прибавить к нему 1; если
отрицательным, то вычесть из него 2; если нулевым,
то заменить его на 10. Вывести полученное число.
 */

import java.util.Scanner;

public class Task_4 {
    public static void main (String [] args) {
        System.out.println("Введите любое число: ");
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        if (inputValue > 0) {
            System.out.println("Введенное вами число положительное: " + inputValue);
            System.out.println("Если к введенному числу привать 1, то получиться результат: " + (inputValue + 1));
        }
        else if (inputValue==0){
            inputValue = 10;
            System.out.println("Вы ввели число ноль, поэтому мы прибавляемем к нему 10. Результат: " + inputValue);
        }
        else {
            System.out.println("Вы ввели отрицательное число: " + inputValue);
            System.out.println("Если из введенного числа вычесть 2, то получиться результат: " + (inputValue - 2));
        }
    }
}
