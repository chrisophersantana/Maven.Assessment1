package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int result = 0;
        for (int x = 1; x <= n; x++)
            result += sumOfDigits(x);

        return result;



    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {


        return null;
        }


    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

        int reversed = 0;
        while (val > 0)
        {
            reversed = reversed * 10 + val % 10;
            val = val / 10;
        }
        return reversed;
    }
}
