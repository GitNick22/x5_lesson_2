package task_2;

/*
Ввести целое трехзначное число в консоли и найти
сумму цифр этого трехзначного числа
 */

import java.util.Scanner;

public class task_2 {
    public static void main (String [] args) {
        System.out.println("Введите любое трехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int firstNum = inputValue / 100;
        int secondNum = (inputValue % 100) / 10;
        int thirdNum = inputValue % 10;
        int sumNum = firstNum + secondNum + thirdNum;
        System.out.println("Первая цифра введенного числа: " + firstNum);
        System.out.println("Вторая цифра введенного числа: " + secondNum);
        System.out.println("Треться цифра введенного числа: " + thirdNum);
        System.out.println("Сумма всех чисел: " + sumNum);
    }

}
