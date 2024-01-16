package oop;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        //MusicPlayer를 사용하는 개발자 입장에서 코드 작성
        //volume, isOn같은 데이터는 전혀 몰라도 된다.
        MusicPlayer player = new MusicPlayer();

        //음악 플레이어 켜기
        player.on();
        //볼륨 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();
    }
}
