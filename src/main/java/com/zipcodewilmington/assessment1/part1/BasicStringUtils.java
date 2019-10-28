package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String output = str.substring(0, 1).toUpperCase() + str.substring(1);
        return output;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder toReverse = new StringBuilder();
        toReverse.append(str);
        toReverse = toReverse.reverse();

        return toReverse.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {



        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String newWord =str.substring(1,str.length()-1);

        return newWord;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char a = chars[i];
            if (Character.isUpperCase(a))
            {
                chars[i] = Character.toLowerCase(a);
            }
            else if (Character.isLowerCase(a))
            {
                chars[i] = Character.toUpperCase(a);
            }
        }
        return new String(chars);


    }
}
