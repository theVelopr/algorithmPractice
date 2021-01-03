package com.fastcampus.jbs.day3;

import java.math.BigInteger;

/** (2021.1.3)
 * 피보나치 수열
 *
 * 피보나치 수열을 출력하는 프로그램을 작성하시오.
 *
 * 피보나치 수열의 점화식 : f(n) = f(n-1) + f(n-2)
 *                        f(1) = 0, f(2) = 1
 *
 * 0, 1, 1, 2, 3, 5, 8, ...
 *
 * 인자
 * seqLength: 출력하고자 하는 피보나치 수열의 길이
 */
public class Fibonacci {
    public static void main(String[] args) {
        /**
         * I knew how to express in math
         * But I had no idea how I will express it
         * in Java.
         * But I understood the solution why it's like this.
         */
        int seqLength = 100;
        BigInteger valOne = BigInteger.ZERO;
        BigInteger valTwo = BigInteger.ONE;
        for (int i = 0 ; i < seqLength; i++) {
            System.out.printf("%d ", valOne); //[1]
            BigInteger valThree = valOne.add(valTwo); //[2]
            valOne = valTwo; // [3]
            valTwo = valThree; // [4]
            /**
             * i = 0
             * [1] - 0
             * [2] - valThree = valOne(0) + valTwo(1) = 1
             * [3] - save valTwo(1) into valOne
             * [4] - save valThree(1) into valTwo
             *
             * i = 1
             * [1] - 1
             * [2] - valThree = valOne(1) + valTwo(1) = 2
             * [3] - save valTwo(1) into valOne
             * [4] - save valThree(2) into valTwo
             *
             * i = 2
             * [1] - 1
             * [2] - valThree = valOne(1) + valTwo(2) = 3
             * [3] - save valTwo(2) into valOne
             * [4] - save valThree(3) into valTwo
             *
             * i = 3
             * [1] - 2
             * [2] - valThree = valOne(2) + valTwo(3) = 5
             * [3] - save valTwo(3) into valOne
             * [4] - save valThree(5) into valTwo
             *
             * so on...
             */
        }
    }
}
