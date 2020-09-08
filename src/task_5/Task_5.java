package task_5;

/*
Ввести три целых числа с консоли. Вывести на
экран наименьшее из них.
 */

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число: ");
        Scanner firstNum = new Scanner(System.in);
        int x = firstNum.nextInt();

        System.out.println("Введите второе целое число: ");
        Scanner secondNum = new Scanner(System.in);
        int y = secondNum.nextInt();

        System.out.println("Введите третье целое число: ");
        Scanner thirdNum = new Scanner(System.in);
        int z = thirdNum.nextInt();

        System.out.println("Вы ввели следующие цифры: " + x + ", " + y + ", " + z);

        if (x < y || x < z) {
            System.out.println("Наименьшее из введеных чисел: " + x);
        } else if (z < y || z < x) {
            System.out.println("Наименьшее из введеных чисел: " + z);
        } else {
            System.out.println("Наименьшее из введеных чисел: " + z);
        }
    }
}
