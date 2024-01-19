package final1;

public class FieldInit {

    //static final을 사용할 경우 대문자로 사용함
    static final int CONST_VALUE = 10;
    final int value = 10;

    //value: 필드에서 이미 선언을 했기 때문에 생성자로 바꿀 수 없음
//    public FieldInit(int value) {
//        this.value = value;
//    }
}
