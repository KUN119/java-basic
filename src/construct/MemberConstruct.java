package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자: 클래스와 이름이 같아야함, 반환 타입이 없어야됨, 나머지는 메서드와 같음
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
