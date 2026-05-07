package BEHAVIOURALPATTERN.StatePattern;

public class PlayingState implements State{
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Already playing!");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Pausing music...");
        player.setState(new PausedState());
        player.setIcon("▶️"); // chuyển sang play icon
    }
}
