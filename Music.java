
public class Music {
	private String musicName; // 노래제목
	private String singer; // 가수 이름
	private int playTime; // play시간
	private String path; // 음악파일경로

	public Music(String musicName, String singer, int playTime) {

		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
	}
	// 생성자 오버로딩
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
