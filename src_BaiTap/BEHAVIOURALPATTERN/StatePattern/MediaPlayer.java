package BEHAVIOURALPATTERN.StatePattern;

public class MediaPlayer {
    private State state;


    public MediaPlayer() {
        state = new PausedState(); // mặc định pause

    }

    public void setState(State state) {
        this.state = state;
    }



    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }


}
