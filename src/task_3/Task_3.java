package task_3;

/*
Ввести целое число в консоли. Если оно является
положительным, то прибавить к нему 1, в противном
случае не изменять его. Вывести полученное число.
 */

import java.util.Scanner;

public class Task_3 {
    public static void main (String [] args) {
        System.out.println("Введите любое число: ");
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        if (inputValue > 0) {
            System.out.println("Введенное число: " + inputValue);
            System.out.println("Если к введенному числу привать 1, то получиться результат: " + (inputValue+1));
        }
        else if (inputValue==0){
            System.out.println("Вы ввели число ноль: " + inputValue);
        }
        else {
            System.out.println("Вы ввели отрицательное число: " + inputValue);
        }
    }
}
