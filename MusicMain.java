import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player(); // 음악을 실질적으로 재생시켜줄 객체
		// 음악리스트가될 ArrayList를 만들어 주세요
//		ArrayList<Music> musicList = new ArrayList<Music>();
//		musicList.add(new Music("깡", "Rain", 100, "C://music/Rain - 깡.mp3")); // 인덱스 0 메소드
//		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 ")); // 인덱스 1
//		musicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3")); // 인덱스 2
//		int index = 0; // 노래 위치정보
		// 기능을 담당하는 객체 생성
		MusicPlayer player = new MusicPlayer();
		while (true) {
			System.out.println("1.재생 2.정지 3.다음곡 4.이전곡 5.종료 >> ");

			int menu = sc.nextInt();

			if (menu == 1) {

//				mp3.play(musicList.get(index).getpath()); // 재생 메소드 play(경로)
				show(player.musicList, player.index);
              player.play();
			} else if (menu == 2) {
				player.mp3.stop();
				System.out.println("음악을 정지합니다");

			} else if (menu == 3) {

				int cnt = player.nextPlay();
				// index 가 2를 넘는다면 show() 를 실행시키지 말아주세요
				if (cnt == 0) {
					show(player.musicList, player.index);
				} else {
					System.out.println("재생할 노래가 없습니다.");
				}
				
			} else if (menu == 4) {
				int cnt = player.beforePlay();
				if(cnt == 0) {
				show(player.musicList, player.index);
				}else {
					System.out.println("이전곡이 없습니다.");
				}
			} else if (menu == 5) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}

	private static void show(ArrayList<Music> musicList, int index) {
		System.out.print(musicList.get(index).getMusicName() + " " + musicList.get(index).getSinger() + " ");
		System.out
				.println(musicList.get(index).getPlayTime() / 60 + "분" + musicList.get(index).getPlayTime() % 60 + "초");

	}

}
