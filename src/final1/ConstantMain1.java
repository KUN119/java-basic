package final1;

public class ConstantMain1 {

    //이 코드는 문제점이 있다 1000이라는 숫자가 무엇을 의미하는지
    //그리고 코드를 변경할 때 1000을 찾아서 다 고쳐줘야 한다.
    //이럴 때 상수를 사용한다.
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수: " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
