package org.oodp._05_state.ex02;

public class PlayingState implements State {
    @Override
    public void play(VideoPlayer player) {
        System.out.println("Video is already playing.");
    }

    @Override
    public void stop(VideoPlayer player) {
        System.out.println("Pausing the video.");
        player.setState(new PausedState());
    }
}