package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        super(); // 부모 클래스 생성자 생략 가능
        System.out.println("Class B 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("Class B 생성자 a=" + a + " b=" + b);
    }
}
