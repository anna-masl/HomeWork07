package app;

import java.util.Arrays;
import java.util.Random;

public class ManHomeWork07 {
    static int sum;
    static int counteven;
    static int countodd;

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[20];

        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(201) - 100;
            if (array[index] < 0) {
                sum += array[index];
            }
        }
        int maxvalue = array[0];
        int minvalue = maxvalue;
        int keymaxvalue = 0;
        int keyminvalue = 0;

        System.out.println(Arrays.toString(array));
        System.out.println("Сума від'ємних чисел: " + sum);

        for (int index = 0; index < array.length; index++) {

            if (array[index] % 2 == 0) {
                counteven++;
            } else countodd++;
            if (array[index] > maxvalue) {
                maxvalue = array[index];
                keymaxvalue = index;
            } else if (array[index] < minvalue) {
                minvalue = array[index];
                keyminvalue = index;
            }
        }

        System.out.println("Кількість парних чисел: " + counteven);
        System.out.println("Кількість непарних чисел: " + countodd);
        System.out.println("Найменший елемент: " + minvalue + " (з індексом " + keyminvalue + ")");
        System.out.println("Найбільший елемент: " + maxvalue + " (з індексом " + keymaxvalue + ")");
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                System.out.println(i);
//                break;
//            } else System.out.println("Від'ємних чисел немає");
//            break;

    }
}

