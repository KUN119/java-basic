package oop;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        // 절차지향 프로그래밍 - 메서드 추출
        // 모듈화 -> 중복 제거, 기능 수정 시 한 모듈만 수정
        // 모듈화: 메서드 호출만으로 손쉽게 사용할 수 있음
        // 메서드 이름으로 가독성이 높아짐
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);

        //볼륨 증가
        volumeUp(data);
        volumeUp(data);

        volumeDown(data);

        //음악 플레이어 상태
        showStatus(data);

        off(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        System.out.print("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
