package array;

import java.util.Arrays;

public class ReverseArray {

    /*
    * This function will accept array as argument and return the reversed array,
    * make start = 0  and end = n-1 (n is size of array),
    * swipe start with end and make start = start+1,and end = end-1.
    * */

    private static int[] reverseArrayFun(int[] arr){

        int start = 0 , end = arr.length-1;

        for(int i = 0; i < arr.length/2; i++){

            arr[end] = arr[start] + arr[end]; // 6+9 = 15
            arr[start] = arr[end] - arr[start];// 15-6 = 9
            arr[end] = arr[end] - arr[start];// 15-9 = 6

            start += 1;
            end -= 1;

        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {6,5,4,7,8,9,10};
      System.out.println("Before reversed: " + Arrays.toString(arr));
      System.out.println("After reversed: " +Arrays.toString(reverseArrayFun(arr)));

    }
}
