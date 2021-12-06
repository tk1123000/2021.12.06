import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player(); // ������ ���������� ��������� ��ü
		// ���Ǹ���Ʈ���� ArrayList�� ����� �ּ���
//		ArrayList<Music> musicList = new ArrayList<Music>();
//		musicList.add(new Music("��", "Rain", 100, "C://music/Rain - ��.mp3")); // �ε��� 0 �޼ҵ�
//		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 ")); // �ε��� 1
//		musicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3")); // �ε��� 2
//		int index = 0; // �뷡 ��ġ����
		// ����� ����ϴ� ��ü ����
		MusicPlayer player = new MusicPlayer();
		while (true) {
			System.out.println("1.��� 2.���� 3.������ 4.������ 5.���� >> ");

			int menu = sc.nextInt();

			if (menu == 1) {

//				mp3.play(musicList.get(index).getpath()); // ��� �޼ҵ� play(���)
				show(player.musicList, player.index);
              player.play();
			} else if (menu == 2) {
				player.mp3.stop();
				System.out.println("������ �����մϴ�");

			} else if (menu == 3) {

				int cnt = player.nextPlay();
				// index �� 2�� �Ѵ´ٸ� show() �� �����Ű�� �����ּ���
				if (cnt == 0) {
					show(player.musicList, player.index);
				} else {
					System.out.println("����� �뷡�� �����ϴ�.");
				}
				
			} else if (menu == 4) {
				int cnt = player.beforePlay();
				if(cnt == 0) {
				show(player.musicList, player.index);
				}else {
					System.out.println("�������� �����ϴ�.");
				}
			} else if (menu == 5) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}

	}

	private static void show(ArrayList<Music> musicList, int index) {
		System.out.print(musicList.get(index).getMusicName() + " " + musicList.get(index).getSinger() + " ");
		System.out
				.println(musicList.get(index).getPlayTime() / 60 + "��" + musicList.get(index).getPlayTime() % 60 + "��");

	}

}
