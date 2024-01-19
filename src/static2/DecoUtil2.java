package static2;

public class DecoUtil2 {

    //static -> 정적 메서드: 인스턴스 호출 없이 클래스 명을 통해 바로 호출할 수 있다.
    public static String deco(String str) {
        return "*" + str + "*";
    }
}
