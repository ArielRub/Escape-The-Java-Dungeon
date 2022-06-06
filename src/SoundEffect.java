import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundEffect {

    Clip clip;

    public void setFile(String soundFileName){
        try{
            File file = new File(soundFileName);
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        }
        catch (Exception e){

        }
    }

    public void setURL(URL soundFileName) {

        try {
            AudioInputStream sound = AudioSystem.getAudioInputStream(soundFileName);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (Exception e) {

        }
    }

        //FIX AUDIO BUG ON TIMER --------------------------->
    public void play() {

        this.clip.setFramePosition(0);
        this.clip.start();
    }

    public static void playSound(String soundFile) {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream;
            inputStream = AudioSystem.getAudioInputStream(SoundEffect.class.getClassLoader().getResource("typewriter-key-1"));
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}