package mx.iteso.reproductores;

import mx.iteso.adapter.reproductores.MP4Player;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 11/9/2015.
 */
public class MP4PlayerTest {
    MP4Player mp4Player;

    @Before
    public void setUP(){
        mp4Player = new MP4Player();
    }

    @Test
    public void playMP4Test(){
        assertEquals("REPRODUCIENDO EL ARCHIVO Ni lo intentes.mp4 CON EL REPRODUCTOR MP4",mp4Player.playMP4("Ni lo intentes.mp4"));
    }

    @Test
    public void playVLCTest(){
        assertEquals("REPRODUCIENDO EL ARCHIVO Los vengadores.vlc CON EL REPRODUCTOR MP4",mp4Player.playVLC("Los vengadores.vlc"));
    }

}
