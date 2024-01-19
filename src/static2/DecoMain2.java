package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s1 = "hello java";
        String s2 = "hello world";

        //정적(클래스,static) 메서드는 객체(인스턴스) 생성없이 메서드를 사용할 수 있다.
        String deco = DecoUtil2.deco(s1);
        String deco2 = DecoUtil2.deco(s2);

        System.out.println("before: " + s1);
        System.out.println("after: " + deco);

        System.out.println();

        System.out.println("before: " + s2);
        System.out.println("after: " + deco2);
    }
}
