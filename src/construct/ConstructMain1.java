package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        //객체를 생성하자마자 생정자를 호출해줌
        MemberConstruct member1 = new MemberConstruct("user1", 18, 80);
        MemberConstruct member2 = new MemberConstruct("user2", 15, 90);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름:" + member.name + " 나이:" + member.age + " 등급:" + member.grade);
        }
    }
}
