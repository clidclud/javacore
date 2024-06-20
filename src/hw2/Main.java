package hw2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//      1. Задание
        int[] arr = {2, 2, 0};
        System.out.println("Задание № 1: \n" +
                "Массив: " + Arrays.toString(arr) + "\n" +
                "Количество чётных элементов массива: " + countEvens(arr));
//      2. Задание
        int[] arr2 = {2, 1, 2, 3, 4};
        System.out.println("Задание № 2: \n" +
                "Массив: " + Arrays.toString(arr2) + "\n" +
                "Разница между самым большим и самым маленьким элементом массива: " + difference(arr2));
//      3. Задание
        int[] arr3 = {1, 3, 5};
        int[] arr4 = {1, 0, 0, 3, 5};
        System.out.println("Задание № 3: \n" +
                "Массив: " + Arrays.toString(arr3) + "\n" +
                "в переданном массиве " +
                "есть два соседних элемента, с нулевым значением: " + twoZeros(arr3));
        System.out.println("Массив: " + Arrays.toString(arr4) + "\n" +
                "в переданном массиве " +
                "есть два соседних элемента, с нулевым значением: " + twoZeros(arr4));
    }

//    1. Написать метод, возвращающий количество чётных элементов массива.
//    countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3
//    countEvens([1, 3, 5]) → 0
    public static int countEvens(int[]arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                count ++;
            }
        }
        return count;
    }

//    2. Написать функцию, возвращающую разницу между самым большим
//    и самым маленьким элементами переданного не пустого массива.
    public static int difference(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        return max - min;
    }

//    3. Написать функцию, возвращающую истину, если в переданном массиве
//    есть два соседних элемента, с нулевым значением.
    public static boolean twoZeros(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
