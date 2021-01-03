package com.fastcampus.jbs.day3;

/**
 * 369게임+
 *
 * 369게임에 참여했을 때, 내가 외쳐야 하는 숫자나 동작을 순서대로 출력하시오.
 *
 * 규칙
 * 1. 3, 6, 9, 5가 포함되지 않은 숫자는 숫자를 외친다. (2!)
 * 2. 숫자에 포함된 3, 6, 9의 개수 만큼 박수를 친다. (짝!) Clap
 * 3. 숫자에 포함된 5의 개수 만큼 발을 구른다. (쿵!) Kick
 * 4. 박수와 발구르기의 순서는 관계 없으나, 반드시 번갈아 수행한다.
 *
 * 예시
 * 2   -> 2!
 * 33  -> 짝!짝!
 * 553 -> 쿵!짝!쿵! (짝!쿵!쿵!x)
 * 47  -> 47!
 *
 * 인자
 * gameLength: 게임이 종료되는 데 걸리는 턴 수
 * numPeople: 게임에 참여하는 인원 수
 * myTurn: 내가 숫자를 외치는 순번
 */
public class ThreeSixNineAdvanced {
    public static void main(String[] args) {
        int gameLength = 1000;
        int numPeople = 12;
        int myTurn = 3;

        /**
         * I'm not capable of solving this problem right now.
         * But I know I can do it by myself in the near future.
         */
        for (int i = myTurn ; i<= gameLength; i+=numPeople) {
            int numClap = 0;
            int numKick = 0;

            int tempVal = i;
            while (tempVal > 0) {
                int currentVal = tempVal % 10;

                if (currentVal == 3 || currentVal == 6 || currentVal == 9) {
                    numClap++;
                } else if (currentVal == 5) {
                    numKick++;
                }
                tempVal /= 10; // I don't get this part.
            }

            if (numClap + numKick == 0) {
                System.out.println(i);
            } else {
                if (numClap > numKick) {
                    while (numClap > 0 || numKick >0) {
                        if (numClap > 0) {
                            System.out.println("Clap!");
                            numClap--;
                        }
                        if (numKick > 0) {
                            System.out.println("Kick!");
                            numKick--;
                        }
                    }
                } else {
                    while (numClap > 0 || numKick > 0) {
                        if (numKick > 0) {
                            System.out.println("Kick!");
                            numKick--;
                        }
                        if (numClap > 0) {
                            System.out.println("Clap!");
                            numClap--;
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
}
