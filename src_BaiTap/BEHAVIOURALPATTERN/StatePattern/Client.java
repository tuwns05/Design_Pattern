package BEHAVIOURALPATTERN.StatePattern;

public class Client {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        player.play();   // từ pause -> play

        player.pause();  // từ play -> pause

        player.pause();
    }
}
