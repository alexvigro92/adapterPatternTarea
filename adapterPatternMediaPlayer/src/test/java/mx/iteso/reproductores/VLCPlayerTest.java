package mx.iteso.reproductores;

import mx.iteso.adapter.reproductores.MP4Player;
import mx.iteso.adapter.reproductores.VLCPlayer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 11/9/2015.
 */
public class VLCPlayerTest {
    VLCPlayer vlcPlayer;

    @Before
    public void setUP(){
        vlcPlayer = new VLCPlayer();
    }

    @Test
    public void playMP4Test(){
        assertEquals("REPRODUCIENDO EL ARCHIVO Ni lo intentes.mp4 CON EL REPRODUCTOR VLC",vlcPlayer.playMP4("Ni lo intentes.mp4"));
    }

    @Test
    public void playVLCTest(){
        assertEquals("REPRODUCIENDO EL ARCHIVO Los vengadores.vlc CON EL REPRODUCTOR VLC",vlcPlayer.playVLC("Los vengadores.vlc"));
    }
}
