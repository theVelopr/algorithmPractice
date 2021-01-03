package com.fastcampus.jbs.day2;

import java.util.Scanner;

/** (2021.1.3)
 * 입력받아 처리하기
 *
 * 3개의 정수를 입력받아, 그 중 최대값을 출력하고자 한다.
 * 이를 수행하는 프로그램을 작성하시오.
 *
 */
public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Integer (1/3): ");
        int valOne = scanner.nextInt();
        System.out.print("Input Integer (2/3): ");
        int valTwo = scanner.nextInt();
        System.out.print("Input Integer (3/3): ");
        int valThree = scanner.nextInt();

        /**
         * I couldn't think of this simple logic.
         * I knew I must use '?:' and I should put
         * another variable to store the result.
         * and most importantly, I really forgot how to use it.
         */
        int valMax = valOne > valTwo ? valOne : valTwo;
        valMax = valMax > valThree ? valMax : valThree;

        System.out.print("\nMaximum value: ");
        System.out.println(valMax);

        /*
        System.out.print("Enter 1st Number : ");
        int n1 = scanner.nextInt();
        System.out.print("Enter 2nd Number : ");
        int n2 = scanner.nextInt();
        System.out.print("Enter 3rd Number : ");
        int n3 = scanner.nextInt();

        if (n1>n2) {
            if (n2 > n3) {
                System.out.println("The biggest number among 3 numbers is : " + n1);
            }
        }
        */
        scanner.close();
    }
}
