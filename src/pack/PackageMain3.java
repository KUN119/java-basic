package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        //다른 패키지의 같은 클래스 이름이면 하나만 import해서 사용 가능
        pack.b.User userB = new pack.b.User();
    }
}
