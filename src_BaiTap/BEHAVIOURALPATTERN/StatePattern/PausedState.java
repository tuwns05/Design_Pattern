package BEHAVIOURALPATTERN.StatePattern;

public class PausedState implements State{

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Playing music...");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused!");
    }
}
