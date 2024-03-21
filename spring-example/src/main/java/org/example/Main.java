package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Music music = context.getBean("testIoC", Music.class);

        MusicPlayer player = new MusicPlayer(music);

        player.playMusic();
        player.playMusic();

        context.close();
    }
}
