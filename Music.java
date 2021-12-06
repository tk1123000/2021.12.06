
public class Music {
	private String musicName; // �뷡����
	private String singer; // ���� �̸�
	private int playTime; // play�ð�
	private String path; // �������ϰ��

	public Music(String musicName, String singer, int playTime) {

		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
	}
	// ������ �����ε�
	public Music(String musicName, String singer, int playTime, String path) {
		super();
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

	public String getpath() {
		return path;
	}
	public String getMusicName() {
		return musicName;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}

}
