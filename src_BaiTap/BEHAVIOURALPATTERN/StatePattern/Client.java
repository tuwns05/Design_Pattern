package BEHAVIOURALPATTERN.StatePattern;

public class Client {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        player.showIcon();

        player.play();   // từ pause -> play
        player.showIcon();

        player.pause();  // từ play -> pause
        player.showIcon();

        player.pause();
    }
}
