package Chap04.Ex00_로또;

import java.util.Scanner;

public class Ex00 {
    public static void main(String[] args) {


        Scanner sc2 = new Scanner(System.in);
        System.out.println("당첨번호 7개를 입력하시오");

        int[] lotto = new int[7];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = sc2.nextInt();

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("입력번호 6개를 입력하시오");

        int num[] = new int[6];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();

            
        }
        System.out.println("입력한 번호");
        for(int i = 0; i < 6; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        System.out.println("당첨 번호");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();

        int count = 0;

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num.length; j++) {

                if (num[i] == lotto[j]) {
                    count++;

                }
            }
        }

        switch (count) {
            case 6: {
                System.out.println("1등");
            }
            case 5: {
                System.out.println("2등");
            }
            case 4: {
                System.out.println("4등");
            }
            case 3: {
                System.out.println("5등");
            }
            default : {
                System.out.println("꽝");
            }

            }

            System.out.println("맞춘 갯수 : " + );



        }

























    }

