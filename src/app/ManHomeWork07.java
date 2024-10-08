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
            if (array[index] % 2 == 0) {
                counteven++;
            } else countodd++;
        }

        int[] arraycopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arraycopy);
        int minvalue = arraycopy[0];
        int maxvalue = arraycopy[arraycopy.length - 1];
        int keymin = Arrays.binarySearch(array, minvalue);
        System.out.println(keymin);
        int keymax = Arrays.binarySearch(array, maxvalue);
        System.out.println(keymax);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arraycopy));
        System.out.println("Сума від'ємних чисел: " + sum);
        System.out.println("Кількість парних чисел: " + counteven);
        System.out.println("Кількість непарних чисел: " + countodd);
        System.out.println("Найменший елемент: " + minvalue + " (з індексом " + keymin + ")");
        System.out.println("Найбільший елемент: " + maxvalue + " (з індексом " + keymax + ")");
        for (int i = 0; i <array.length; i++) {
            if (array[i] < 0){
                System.out.println(i);
                break;
            } else System.out.println("Від'ємних чисел немає");
            break;

        }
    }
}
