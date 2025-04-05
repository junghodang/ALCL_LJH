package Chap04.Ex00_로또;

import java.util.Scanner;

public class Ex00 {
    public static void main(String[] args) {


        Scanner sc2 = new Scanner(System.in);
        System.out.println("당첨번호 6개와 보너스숫자를 입력하시오");

        int[] lotto = new int[7];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = sc2.nextInt();
        }




        System.out.println("본인번호 6개를 입력하시오");

        int num[] = new int[6];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc2.nextInt();  
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

        int rank = 0;

        switch (count) {
            case 6: {
                rank = 1;
                break;
            }
            case 5: {
                rank = 3;
                for (int i =0; i < num.length; i++) {
                    if ( lotto[6] == num [i]) {
                        rank =2;
                    }
                    
                }
                break;
            }
            case 4: {
                rank = 4;
                break;

            }
            case 3: {
                rank = 5;
                break;

            }
            default : {
                rank = 0;
                break;

            }

        }
        System.out.println(rank + "등");

            System.out.println("맞춘 갯수 : " + count );



        }

























    }

