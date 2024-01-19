package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        //초기화
        Member member = new Member("kun", "kunzzang");
        member.print();

        //id, name 변경 -> id는 final이기 때문에 변경이 되지 않음
        member.changeData("changeID", "changeName");
        member.print();
    }
}

