package Chap01;

import java.util.Scanner;

// import : 외부 클래스를 포함시키는 키워드
// * import 패키지.클래스명;

// import 하는 법
// 1. 클래스          : ctrl + space
// 2. 전체 import     : alt + shift + O


public class Ex03_Scanner {
    
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("a : ");
        int a = sc.nextInt();

        System.out.println("a : " + a);

        // close() : Scanner 객체를 메모리에서 해제하는 메소드
        sc.close();

        // sc.nextInt();
        // * Scannner 객체를 해제한 이후에는 더 이상 입력을 받을 수 없다.
    }

}
