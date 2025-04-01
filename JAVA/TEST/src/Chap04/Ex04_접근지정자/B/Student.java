package Chap04.Ex04_접근지정자.B;

import Chap04.Ex04_접근지정자.A.Person;

public class Student extends Person {
    
    public Student() {
        super();
    }

    public Student(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }
    
    // 메소드
    public void defaultSettgin() {
        name = "이름없음";   // public, 모든 곳에서 접근 가능
        age = 20;           // protected, 다른 패키지이지만 Person 상속받아서 접근가능
        setHeight(170);       // defalut, 같은 패키지가 아니라서 기존 방법으로 접근 불가(세터사용)
        setWeight(60);        // pravite, 해당 클래스에서만 접근 가능 (세터사용)
    }
    
}
