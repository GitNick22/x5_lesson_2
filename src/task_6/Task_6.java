package task_6;

/*
 Ввести целое число в консоли. Вывести его строку описание вида «отрицательное четное число»,
«нулевое число», «положительное нечетное число» и т. д.
 */

import java.util.Scanner;

public class Task_6 {
    public static void main (String [] args) {
        System.out.println("Введите любое целое число: ");
        Scanner firstNum = new Scanner(System.in);
        int x = firstNum.nextInt();
        int chetNeChet = x % 2;
        if (x == 0) {
            System.out.println("Введенное вами число равно нулю: " + x);
        }
        else if (x < 0 && chetNeChet == 0){
            System.out.println("Вы ввели отрицательное четное число: " + x);
        }
        else if (x < 0){
            System.out.println("Вы ввели отрицательное нечетное число: " + x);
        }
        else if (chetNeChet == 0){
            System.out.println("Вы ввели положительное четное число: " + x);
        }
        else {
            System.out.println("Вы ввели положительное нечетное число: " + x);
        }
    }
}
