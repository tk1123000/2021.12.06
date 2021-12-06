import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import javazoom.jl.player.Player;

public class MusicPlayer {

	// Controller : 실질적인 기능이 수행될 클래스

	ArrayList<Music> musicList = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();
	int index = 0;

	public MusicPlayer() {
		musicList.add(new Music("깡", "Rain", 100, "C://music/Rain - 깡.mp3")); // 인덱스 0 메소드
		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 ")); // 인덱스 1
		musicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3")); // 인덱스 2
	}

	// 재생기능 빼주기
	public void play() {
		mp3.play(musicList.get(index).getpath());
	} // Conroller 불어와서 실행시키기

	// show(Player.musicList, player.index);
	
	// 다음곡을 실행할 기능
	public int nextPlay() {
		int cnt=0; //재생할 곡이 있는지 없지를 판별
		if (mp3.isPlaying()) {
			// 현재 재생중인 노래가 있다면 true
			// 현재 재생중인 노래가 없다면 false
			mp3.stop();
		}
		if (index < musicList.size() - 1) { // nusicList가 크기가 3이기 때문에 마지막 인덱스는 2이고 3이없기에 오류가남
											// index 2로 만들기위해 -1을 해줌
			index++;
			// isplaying() -> 현재 재생 중인지 판단하는 메소드
			// stop() -> 현재 재생 중인 노래를 멈춰주는 메소드!

			mp3.play(musicList.get(index).getpath());
		} else {
		  cnt++;
		}
		return cnt;
	} 
	// beforePlay 메소드 만들어 주세요
    public int beforePlay() {
    	int cnt = 0;
    	if (mp3.isPlaying()) {
			mp3.stop();
			
			// index-- 이기 때문에 index = -1이 없기 때문에 조건문 달아준다
												// index가 0이 된다면 '이전곡이 없습니다' 출력후 계속 실행
		} 
    	index--;
    	if (index>=0) {
    		
			mp3.play(musicList.get(index).getpath());
		}else {
			cnt++;
		
		}return cnt;
    }
}
