package pro.sky.lesson6;

import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("задание 1");
        int[] outgo = generateRandomArray();
        System.out.println(Arrays.toString(outgo));
        System.out.println();
        int sum = 0;
        for (int index = 0; index < outgo.length; index++) {
            int value = outgo[index];
            sum += value;
        }
        System.out.println("Всего за месяц " + sum);
        System.out.println();

        System.out.println("Задание №2");
        int min = outgo[0];
        int minIndex = 0;
        for (int i = 1; i < outgo.length; i++) {
            if (outgo[i] < min) {
                min = outgo[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        int max = outgo[0];
        int maxIndex = 0;
        for (int i = 1; i < outgo.length; i++) {
            if (outgo[i] > max) {
                max = outgo[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println();

        System.out.println("Задание №3");
        float averageOutgo = sum / 30f;
        System.out.println(averageOutgo);
        System.out.println();

        System.out.println("Задание №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > 0 - 1; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        System.out.println();

        System.out.println("Задание 5");
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[1][1] = 1;
        matrix[2][2] = 1;
        matrix[0][2] = 1;
        matrix[2][0] = 1;

                for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


