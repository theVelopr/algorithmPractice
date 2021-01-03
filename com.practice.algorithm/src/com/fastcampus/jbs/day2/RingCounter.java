package com.fastcampus.jbs.day2;
/**
 * 링카운터 출력기
 *
 * 크기가 4인 링카운터는 아래와 같이 동작한다.
 *
 * 0b0001 -> 0b0010 -> 0b0100 -> 0b1000 -> 0b0001 ...
 *
 * 즉, 링카운터는 하나의 비트만 1의 값을 가지며 1의 위치가 N번마다 반복되는 형태로 동작한다.
 *
 * 링카운터의 크기 numBits와 카운트된 횟수 numCount를 이용하여
 * 현재 링카운터의 값을 10진수로 출력하는 프로그램을 작성하시오.
 */
public class RingCounter {
    public static void main(String[] args) {
        int numBits = 12;
        int numCount = 19;

        /**
         * Actually, I don't really get the concept of Bitwise operator.
         * However, based on my observation on this problem
         * I guess this is how this problem works.
         */
        int currentCount = (numCount - 1) % numBits;
        // (19-1) % 12 = 6
        //    b00...00000001 = 2^0 [0] -> b00...0000010 = 2^1 [1] -> b00...0000100 = 2^2 [2]
        // -> b00...00001000 = 2^3 [3] -> b00...0010000 = 2^4 [4] -> b00...0100000 = 2^5 [5]
        // -> b00...01000000 = 2^6 [6]
        System.out.println(1 << currentCount); // move '1' to the left as the value of currentCount.
        // Therefore, the answer is 2^6 = 64.
    }
}
