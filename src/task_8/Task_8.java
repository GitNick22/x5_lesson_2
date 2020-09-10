package task_8;

import java.util.Arrays;

/* Дан массив целых чисел:
[1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного
массива найти и вывести на экран:
 - максимальное значение
 - сумму положительных элементов
 - сумму четных отрицательных элементов
 - количество положительных элементов
 - среднее арифметическое отрицательных элементов */
public class Task_8 {
    public static void main(String[] args) {

        int[] arrayList = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        int maxValue = arrayList[0];

            for (int i = 1; i < arrayList.length; i++) {
                if (arrayList[i] > maxValue) {
                    maxValue = arrayList[i];
                }
            }
        System.out.println("1. Максимальное значение: " + maxValue);

        int sumOfPositiveElements = 0;
        int a = 0;
            for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[a] > 0) {
                sumOfPositiveElements = sumOfPositiveElements + arrayList[a];
            }
            a++;
        }
        System.out.println("2. Сумма положительных элементов: " + sumOfPositiveElements);

        int sumOfEvenNegativeElements = 0;
        int t = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[t] < 0 && (arrayList[t] * -1) % 2 == 0) {
                sumOfEvenNegativeElements = (sumOfEvenNegativeElements) + (arrayList[t]);
            }
            t++;
        }
        System.out.println("3. Сумма четных отрицательных элементов: " + sumOfEvenNegativeElements);

        int countPositiveElements = 0;
        int f = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[f] > 0) {
                countPositiveElements++;
            }
            f++;
        }
        System.out.println("4. Количество положительных элементов: " + countPositiveElements);

        double sumNegativeElements = 0;
        double countNegativeElements = 0;
        int g = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[g] < 0) {
                sumNegativeElements = (sumNegativeElements) + (arrayList[g]);
                countNegativeElements++;
            }
            g++;
        }

        //System.out.println("Сумма отрицательных элементов: " + sumNegativeElements);
        //System.out.println("Количество отрицательных элементов: " + countNegativeElements);
        System.out.println("5. Среднее арифметическое отрицательных элементов: " + (sumNegativeElements / countNegativeElements));

    }
}

