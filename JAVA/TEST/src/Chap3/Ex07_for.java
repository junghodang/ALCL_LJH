package Chap3;

public class Ex07_for {
    public static void main(String[] args) {
        // for( 1초기식 ; 2조건식 ; 4증감식 ) { 3 실행문 }
        // - 실행 순서 : 1 -> 반복 ( 2 -> 3 -> 4)
        // - 반복 변수 : 1

        // 1. 1~10 까지 정수를 출력하시오
        for ( int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. 50 ~ 100

        // for ( int i = 50; i <=100; i++){
        //     System.out.print(i + " ");

        // 3. 1~20 까지 정수 중 홀수만 출력하시오.
        for (int i = 0; i <=20; i += 2) {
            System.out.print( i + " ");
        }

        // 4. 1~20 까지 정수 중 짝수만 출력하시오.
        for (int i = 2; i <=20; i +=2) {
            System.out.print(i + " ");
        }
        
        }
    }

