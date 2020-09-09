package task_7;

import java.util.Scanner;

/*
Написать программу, вычисляющую стоимость 10
минутного междугороднего разговора в зависимости
от кода города. ( Москва(905) - 4.15руб. Ростов(194) -
1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00
руб. ). Пользователь в консоли должен ввести код
города, а в ответ от программы получить, например,
при вводе кода 905, - «Москва. Стоимость разговора:
41.5»
 */
public class Task_7 {
    public static void main (String [] args) {

        System.out.println("Введите код вашего города: ");
        Scanner firstNum = new Scanner(System.in);
        int cityCode = firstNum.nextInt();
        int time = 10;
        if (cityCode == 905) {
            System.out.println("Москва. Стоимость разговора: " + time * 4.15 + " руб.");
        }
        else if (cityCode == 194) {
            System.out.println("Ростов. Стоимость разговора: " + time * 1.98 + " руб.");
        }
        else if (cityCode == 491) {
            System.out.println("Краснодар. Стоимость разговора: " + time * 2.69 + " руб.");
        }
        else if (cityCode == 800) {
            System.out.println("Киров. Стоимость разговора: " + time * 5.00 + " руб.");
        }
        else {
            System.out.println("Такого города в справочнике нет!");
        }
    }
}
