package ru.myapp.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music musicClassical = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicClassicalPlayer = new MusicPlayer(musicClassical);
//        musicClassicalPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();

//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong() );

        // TestBean testBean = context.getBean("testBean", TestBean.class);
        // System.out.println(testBean.getName());

        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(secondMusicPlayer.getVolume());
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        System.out.println(comparison);
//
//        firstMusicPlayer.setVolume(100);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
    }
}
