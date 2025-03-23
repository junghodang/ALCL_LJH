package Chap3;

import java.util.Scanner;

public class Ex04_Switch {
    public static void main(String[] args) {
        // 학점을 입력받아, 점수 구간을 출력하시오.
        // A : 90점 ~ 100점 입니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("학점 : ");
        // String(문자형) 참조 자료형
        String grade = sc.next();
        // * 문자, 정수, 문자열 switch 문의 조건값으로 가능
        // * 실수(float, double) 조건값으로 불가능
        switch (grade) {
            case "A" : System.out.println("90~100점 입니다."); break;
            case "B" : System.out.println("80~89점 입니다."); break;
            case "C" : System.out.println("70~79점 입니다."); break;
            case "D" : System.out.println("60~69점 입니다."); break;
            case "E" : System.out.println("50~59점 입니다."); break;
            case "F" : System.out.println("40~49점 입니다."); break;
            default : System.out.println("A~F 사이의 문자를 입력해주세요"); break;
        }
        sc.close();
    }
}
