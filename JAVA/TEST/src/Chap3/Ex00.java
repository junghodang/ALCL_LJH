package Chap3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex00 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("로또번호 6개를 입력하시오");

        int num[] = new int[6];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if(num[i] > 45 || num[i] < 0 ) {
                System.out.println("0~45 사이만 입력하시오");
            }
            for ( int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    System.out.println("중복숫자 입력 불가능");
                }
            }

        }

        Arrays.sort(num);

        System.out.println("입력한 번호");
        for(int i = 0; i < 6; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();


        
        int[] lotto = new int[6];

        for(int i = 0; i < 6; i++) {
            lotto[i] = (int) (Math.random() * 45) +1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(lotto);

        System.out.println("당첨 번호");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();

        int luck = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++){
                if(num[i] == lotto[j]) {
                    luck++;
                }
            }
        }

        switch (luck) {
            case 1: {
                System.out.println("1등");
            }
            case 2: {
                System.out.println("2등");
            }
            case 3: {
                System.out.println("3등");
            }
            case 4: {
                System.out.println("4등");
            }
            default : {
                System.out.println("꽝");
            }

            }

            System.out.println("맞춘 갯수 : " + luck);



        }

























    }

