package array;


/*
* This program is all about to find the maximum and minimum value from the array.
* */

import java.util.Arrays;

public class FindMinMax {

    /*
    * This function will return the min and max value,
    * Since can not return two value from the function so,
    * So create class, return the object of the class
    * */
    public static MinMax findMinMax(int[] arr){

        MinMax minMax = new MinMax();

        /*
        * if array has only one value then return the same value as min and max.
        * */

        if(arr.length==1){
            minMax.max = arr[0];
            minMax.min = arr[0];
        }
        /*
         * if array has more than one value then,
         * Initialize the value of min and max
         * */
        if(arr[0]> arr[1]){
            minMax.max = arr[0];
            minMax.min = arr[1];
        }else{
            minMax.max = arr[1];
            minMax.min = arr[0];
        }

        /*
        * Iterate the loop to find the min and max value,
        * iterate the loop from i=2
        * */

        for(int i = 2; i < arr.length; i++){

            if(arr[i] > minMax.max){
                minMax.max = arr[i];
            }else if(arr[i] < minMax.min){
                minMax.min = arr[i];
            }
        }
        return minMax;
    }

    public static void main(String[] args) {
        int[] arr = {200,300,1,4,1000};
        System.out.println("Input Array: "+ Arrays.toString(arr));
        MinMax minMax = findMinMax(arr);
        System.out.println("Min: "+ minMax.min + ", Max: "+ minMax.max);
    }
    /*
    * This class has min and max variable to hold the value
    * */
    private static class MinMax {
        int min;
        int max;
    }
}
