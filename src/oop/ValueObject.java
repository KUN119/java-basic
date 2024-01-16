package oop;

//여기서 만드는 add()메서드는 static키워드를 사용하지 않는다
//메서드는 객체를 생성해야 호출할 수 있다. 그런데 static이 붙으면 객체를 생성하지 않고도 메서드를 호출할 수 있다.
public class ValueObject {
    int value;

    void add() {
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
