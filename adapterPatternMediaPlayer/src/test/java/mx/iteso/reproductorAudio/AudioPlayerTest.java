package mx.iteso.reproductorAudio;

import mx.iteso.adapter.MediaAdapter;
import mx.iteso.adapter.reproductorAudio.AudioPlayer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mavg_ on 11/9/2015.
 */
public class AudioPlayerTest {
    AudioPlayer audioPlayer;
    MediaAdapter mediaAdapter;

    @Before
    public void setUP(){
        mediaAdapter = mock(MediaAdapter.class);
        audioPlayer = new AudioPlayer(mediaAdapter);
    }

    @Test
    public void playTestNormal(){
        when(mediaAdapter.play("Same old love.mp3")).thenReturn("REPRODUCIENDO EL ARCHIVO Same old love.mp3 CON EL REPRODUCTOR MP3");
        assertEquals("REPRODUCIENDO EL ARCHIVO Same old love.mp3 CON EL REPRODUCTOR MP3",audioPlayer.play("Same old love.mp3"));
    }

    @Test
    public void playTestMP4(){
        when(mediaAdapter.play("Same old love.mp4")).thenReturn("REPRODUCIENDO EL ARCHIVO Same old love.mp4 CON EL REPRODUCTOR MP4");
        assertEquals("REPRODUCIENDO EL ARCHIVO Same old love.mp4 CON EL REPRODUCTOR MP4",audioPlayer.play("Same old love.mp4"));
    }

    @Test
    public void playTestVLC(){
        when(mediaAdapter.play("Same old love.vlc")).thenReturn("REPRODUCIENDO EL ARCHIVO Same old love.vlc CON EL REPRODUCTOR VLC");
        assertEquals("REPRODUCIENDO EL ARCHIVO Same old love.vlc CON EL REPRODUCTOR VLC",audioPlayer.play("Same old love.vlc"));
    }

}
