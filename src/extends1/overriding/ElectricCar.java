package extends1.overriding;

public class ElectricCar extends Car {

    //오버라이딩: 부모의 메서드를 새롭게 재정의한다.
    @Override //필수는 아니지만 붙였을 경우 컴파일 오류를 뱉어주기 때문에 권장됨
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("배터리를 충전합니다.");
    }
}
