package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    //static 메서드는 static만 접근 가능
    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근 -> compile error
        //instanceMethod(); //인스턴스 메서드 접근 -> compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    //인스턴스 객체의 참조값을 넘겨줘서 그 참조값을 사용하는건 가능하다.
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    //인스턴스 메서드는 정적 변수 정적 메서드에도 접근 가능
    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue=" + staticValue);
    }

}
