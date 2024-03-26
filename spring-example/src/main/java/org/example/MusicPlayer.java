package org.example;

public class MusicPlayer {
    private Music music1;
    private Music music2;

    public MusicPlayer(Music music1, Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }
/* public void setMusic(Music music) {
        this.music = music;
    }*/

    public void playMusic(){
        System.out.println("Playing " + music1.getSong());
        System.out.println("Playing " + music2.getSong());
    }
}