package access;

public class Speaker {
    // private 접근 제어자를 넣어주면 현재 클레스에서만 접근이 가능하다!!!!!!!!!!!!
    // 때문에 다른 클래스에서는 volume에 직접 접근하지 못 하고 public 메서드만 사용할 수 있다.
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("음량을 증가시킬 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가했습니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
