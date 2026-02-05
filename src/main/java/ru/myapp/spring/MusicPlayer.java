package ru.myapp.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //    @Autowired
//    @Qualifier("rockMusic")
    private Music musicOne;
    private Music musicTwo;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music musicOne, @Qualifier("rockMusic") Music musicTwo) {
        this.musicOne = musicOne;
        this.musicTwo = musicTwo;
    }

    //    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
//
//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    //    @Autowired
//    private Music music;

//    private ClassicalMusic classicalMusic;

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

//    private String name;
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }

    // IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

//    public MusicPlayer() {}
//
//    public void setMusic(Music music) { this.music = music; }

    public String playMusic() {
        return "Playing: " + musicOne.getSong() + "and " + musicTwo.getSong();
    }
}
