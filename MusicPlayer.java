import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import javazoom.jl.player.Player;

public class MusicPlayer {

	// Controller : �������� ����� ����� Ŭ����

	ArrayList<Music> musicList = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();
	int index = 0;

	public MusicPlayer() {
		musicList.add(new Music("��", "Rain", 100, "C://music/Rain - ��.mp3")); // �ε��� 0 �޼ҵ�
		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 ")); // �ε��� 1
		musicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3")); // �ε��� 2
	}

	// ������ ���ֱ�
	public void play() {
		mp3.play(musicList.get(index).getpath());
	} // Conroller �Ҿ�ͼ� �����Ű��

	// show(Player.musicList, player.index);
	
	// �������� ������ ���
	public int nextPlay() {
		int cnt=0; //����� ���� �ִ��� ������ �Ǻ�
		if (mp3.isPlaying()) {
			// ���� ������� �뷡�� �ִٸ� true
			// ���� ������� �뷡�� ���ٸ� false
			mp3.stop();
		}
		if (index < musicList.size() - 1) { // nusicList�� ũ�Ⱑ 3�̱� ������ ������ �ε����� 2�̰� 3�̾��⿡ ��������
											// index 2�� ��������� -1�� ����
			index++;
			// isplaying() -> ���� ��� ������ �Ǵ��ϴ� �޼ҵ�
			// stop() -> ���� ��� ���� �뷡�� �����ִ� �޼ҵ�!

			mp3.play(musicList.get(index).getpath());
		} else {
		  cnt++;
		}
		return cnt;
	} 
	// beforePlay �޼ҵ� ����� �ּ���
    public int beforePlay() {
    	int cnt = 0;
    	if (mp3.isPlaying()) {
			mp3.stop();
			
			// index-- �̱� ������ index = -1�� ���� ������ ���ǹ� �޾��ش�
												// index�� 0�� �ȴٸ� '�������� �����ϴ�' ����� ��� ����
		} 
    	index--;
    	if (index>=0) {
    		
			mp3.play(musicList.get(index).getpath());
		}else {
			cnt++;
		
		}return cnt;
    }
}
