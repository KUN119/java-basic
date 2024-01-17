package pack.a;

public class User {

    //다른 패키지에서 클래스의 생성자를 호출하려면 public이어야 함
    public User() {
        System.out.println("패키지 pack.a 회원 생성");
    }
}
