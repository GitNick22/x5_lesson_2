package task_9;

/*
Дан массив целых чисел:
[15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
Переставить элементы массива в обратном порядке.
Вывести результат в консоль
 */

public class Task_9 {
    public static void main(String[] args) {
        int[] arrayList = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] arrayList2 = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

        int arrayLength = arrayList.length;
        int x = arrayLength - 1;
        int b;

        System.out.println("Исходный массив: ");
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print(arrayList[i] + " ");
        }

        System.out.println();

        for (int t = 0; t < arrayLength/2; t++) {
            b = arrayList[arrayLength - t - 1];
            arrayList[arrayLength - t - 1] = arrayList[t];
            arrayList[t] = b;
        }

        System.out.println("Массив в обратном порядке: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(arrayList[i] + " ");
        }

        System.out.println();

        System.out.println("Массив в обратном порядке (построчно): ");
        for (int z = 0; z < arrayLength; z++) {
            System.out.println(arrayList2[x]);
            x--;
        }

    }
}