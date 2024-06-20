package les2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

/*        Задача с большими числами

        BigDecimal a = BigDecimal.valueOf(9999999);

        Scanner scanner = new Scanner(System.in);
        BigDecimal b = scanner.nextBigDecimal();

        System.out.println(b.multiply(a));*/

/*        Задача:
        1 0 0 0 1
        0 1 0 1 0
        0 0 1 0 0
        0 1 0 1 0
        1 0 0 0 1

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] array = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j || i + j == num - 1) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/

/*
        Написать функцию добавления элемента в конец массива таким
        образом, чтобы она расширяла массив при необходимости.
*/

/*int [] myArray = {1,2,3,4,5};
int num = 6;
int [] newArray = new int[myArray.length + 1];
        newArray[newArray.length - 1] = num;
        for (int i = 0; i < newArray.length; i++) {
            if (i < myArray.length) {
                newArray[i] = myArray[i];
            } else {
                newArray[i] = num;
            }
        }
        System.out.println(Arrays.toString(newArray));*/

/*        int arr[] = {5,3,6,2,4,3,7};
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/

        int[]arr = {6,5,3,6,5,3,2,6,3,4,2};

        System.out.println("Исходны: " + Arrays.toString(arr));
        System.out.println("Отсортированный: " + Arrays.toString(countSort(arr)));
    }

    public static int[] countSort(int[] arr){
        int[] tmpArr = new int [arr.length];

        TreeMap <Integer, Integer> map = new TreeMap <>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
//            if (map.containsKey(arr[i])){
//                map.put(arr[i], map.get(arr[i]) + 1);
//            } else {
//                map.put(arr[i], 1);
//            }
        }

        int i = 0;

        for (Integer key : map.keySet()){
            for (int j = 0; j < map.get(key); j++) {
                tmpArr[i++] = key;
            }
        }

        return tmpArr;

    }
}

