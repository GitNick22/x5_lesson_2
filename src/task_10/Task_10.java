package task_10;

import java.util.Arrays;

/*
Дан массив целых чисел:
[15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить нули в конец массива. Вывести результат в консоль
 */

public class Task_10 {
    public static void main(String[] args) {
       int[] arrayList = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
       int countZero;
       int count = 0;

       System.out.println("Исходный массив: ");
       System.out.println(Arrays.toString(arrayList));

       for (int i = 0; i < arrayList.length; i++) {
           if (arrayList[i] != 0) {
               countZero = arrayList[count];
               arrayList[count] = arrayList[i];
               arrayList[i] = countZero;
               count = count + 1;
           }
       }
               System.out.println("Массив после перемещения нулей в конец списка: ");
               System.out.println(Arrays.toString(arrayList));
    }
}
