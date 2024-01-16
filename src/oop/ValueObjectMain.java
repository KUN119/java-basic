package oop;

public class ValueObjectMain {
    public static void main(String[] args) {
        //객체를 생성하면 valueObject객체 안에 int value 멤버변수 도 있고, add()메서드도 있다.
        ValueObject valueObject = new ValueObject();

        //ValueObject의 메서드도 사용할 수 있음
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자=" + valueObject.value);
    }
}
