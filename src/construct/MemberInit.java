package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade){ //-> 매개변수에 접근함
        //멤버 변수와 매개 변수의 이름이 같다면 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 매개변수가 우선순위를 가진다.
        this.name = name; // 멤버 변수에 접근하려면 this.을 사용한다. 여기서 this는 인스턴스 자신의 참조값을 가리킨다.
        this.age = age;
        this.grade = grade;
    }
    //즉, this.name = name에서 this.name은 멤버 변수이고, name은 매개 변수이다!!!!
}
