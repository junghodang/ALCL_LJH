package Ms;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int eng = sc.nextInt();
        int math = sc.nextInt();
        int java = sc.nextInt();

        sc.close();

        System.out.println("영어 점수 : " + eng);
        System.out.println("수학 점수 : " + math);
        System.out.println("자바 점수 : " + java);

        int total = eng + math + java;
        System.out.println("총점 : " + total);

        double average = total/3;
        System.out.println("평균 : " + average);






























    }
}
