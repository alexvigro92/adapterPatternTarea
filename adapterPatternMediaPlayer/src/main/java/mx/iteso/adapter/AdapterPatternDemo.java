package mx.iteso.adapter;

import mx.iteso.adapter.reproductorAudio.AudioPlayer;
import mx.iteso.adapter.reproductores.MP4Player;
import mx.iteso.adapter.reproductores.VLCPlayer;

/**
 * Created by mavg_ on 11/9/2015.
 */
public class AdapterPatternDemo{
    public static void main(String[] args)
    {
        AdvancedMediaPlayer advanceMediaPlayer = new MP4Player();
        MediaAdapter mediaAdapter = new MediaAdapter(advanceMediaPlayer);
        AudioPlayer audioPlayer = new AudioPlayer(mediaAdapter);

        audioPlayer.play("Ni lo intentes.mp4");
        audioPlayer.play("The hills.mp4");
        audioPlayer.play("Los vengadores.vlc");
        audioPlayer.play("Los simpsons.vlc");
        audioPlayer.play("Discovery channel.rar");

        advanceMediaPlayer = new VLCPlayer();
        mediaAdapter = new MediaAdapter(advanceMediaPlayer);
        audioPlayer = new AudioPlayer(mediaAdapter);

        audioPlayer.play("Good for you.mp3");
        audioPlayer.play("Same old love.mp3");
        audioPlayer.play("Wildest dreams.mp4");
        audioPlayer.play("Piensalo.mp4");
        audioPlayer.play("007 Casino royal.vlc");
        audioPlayer.play("Matrix.vlc");
        audioPlayer.play("Tarea 5.rar");
        audioPlayer.play("California dreams.rar");

    }
}