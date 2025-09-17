package proj1;
interface Media{
	void play();
	void stop();
	default void pause() {
		System.out.println("Media Paused");
	}
	static void about() {
		System.out.println("This is a Media Interface.");
	}
}
interface AdvancedMedia extends Media{
	void nextTrack();
}
class MusicPlayer implements AdvancedMedia{
	public void play() {
		System.out.println("Music Started");
	}
	public void stop() {
		System.out.println("Music Stopped");
	}
	public void nextTrack() {
		System.out.println("Next Song");
	}
}

public class InterfaceDemo2 {
	public static void main(String [] args) {
		MusicPlayer musicPlayer = new MusicPlayer();
		musicPlayer.play();
		musicPlayer.nextTrack();
		musicPlayer.pause();
		Media.about();
		musicPlayer.stop();
	}
}
