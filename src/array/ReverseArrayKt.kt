package array

import java.util.*

/*
    * This function will accept array as argument and return the reversed array,
    * make start = 0  and end = n-1 (n is size of array),
    * swipe start with end and make start = start+1,and end = end-1.
    * */

    /*
    * This function will accept array as argument and return the reversed array,
    * make start = 0  and end = n-1 (n is size of array),
    * swipe start with end and make start = start+1,and end = end-1.
    * */
    private fun reverseArrayFun(arr: IntArray): IntArray? {
        var start = 0
        var end = arr.size - 1
        for (i in 0 until arr.size / 2) {
            arr[end] = arr[start] + arr[end] // 6+9 = 15
            arr[start] = arr[end] - arr[start] // 15-6 = 9
            arr[end] = arr[end] - arr[start] // 15-9 = 6
            start += 1
            end -= 1
        }
        return arr
    }

    fun main(args: Array<String>) {
        val arr = intArrayOf(6, 5, 4, 7, 8, 9, 10)
        println("Before reversed: " + Arrays.toString(arr))
        println("After reversed: " + Arrays.toString(reverseArrayFun(arr)))
    }
