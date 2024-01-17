package construct;

public class ConstructMain2 {

    public static void main(String[] args) {
        // 객체를 생성하자마자 생정자를 호출해줌
        // 생성자 오버로딩을 통해 grade가 있는 생성자, 없는 생성자 호출
        MemberConstruct member1 = new MemberConstruct("user1", 18, 80);
        MemberConstruct member2 = new MemberConstruct("user2", 15);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름:" + member.name + " 나이:" + member.age + " 등급:" + member.grade);
        }
    }
}
