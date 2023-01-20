package edu.demo;

import java.util.Arrays;
/**
 *
 * Main method
 * Method is used to launch app
 * */
public class Main {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 98, 21, 7, 36};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 98));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 98));
        System.out.println(Arrays.toString(getAllMultipleElements(array, 2)));

    }


    /**
     * <b> Methods </b> returns all <i>multiple</i>  elements for input <u> array </u> by input value
     * @param array input array
     * @param n     multiple to element
     * @return int[]
     * */
    public static int[] getAllMultipleElements(int[] array, int n) {
        int[] result = new int[array.length];
        int i = 0;
        for (int element : array) {
            if(element % n == 0) {
                result[i] = element;
                i++;
            }
        }
        return result;
    }

    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

}