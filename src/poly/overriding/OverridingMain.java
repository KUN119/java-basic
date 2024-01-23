package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 호출
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); //변수는 오버라이딩 x
        poly.method(); //메서드 오버라이딩
        //오버라이딩은 항상 우선 순위로 호출!
    }
}
