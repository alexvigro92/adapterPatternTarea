package mx.iteso;

import mx.iteso.adapter.AdvancedMediaPlayer;
import mx.iteso.adapter.MediaAdapter;
import mx.iteso.adapter.reproductores.MP4Player;
import mx.iteso.adapter.reproductores.VLCPlayer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mavg_ on 11/9/2015.
 */
public class MediaAdapterTest {
    MediaAdapter mediaAdapter;
    MediaAdapter mediaAdapter2;
    MP4Player mp4PlayerThis;
    VLCPlayer vlcPlayerThis;

    @Before
    public void setUP(){
        vlcPlayerThis = mock(VLCPlayer.class);
        mp4PlayerThis = mock(MP4Player.class);
        mediaAdapter = new MediaAdapter(vlcPlayerThis);
        mediaAdapter2 = new MediaAdapter(mp4PlayerThis);
    }

    @Test
    public void playMP4Test(){
        when(mediaAdapter.play("Wildest dreams.mp4")).thenReturn("REPRODUCIENDO EL ARCHIVO Wildest dreams.mp4 CON EL REPRODUCTOR VLC");
        assertEquals(mediaAdapter.play("Wildest dreams.mp4"),"REPRODUCIENDO EL ARCHIVO Wildest dreams.mp4 CON EL REPRODUCTOR VLC");
    }

    @Test
    public void playVLCTest(){
        when(mediaAdapter2.play("Wildest dreams.vlc")).thenReturn("REPRODUCIENDO EL ARCHIVO Wildest dreams.vlc CON EL REPRODUCTOR MP4");
        assertEquals(mediaAdapter2.play("Wildest dreams.vlc"),"REPRODUCIENDO EL ARCHIVO Wildest dreams.vlc CON EL REPRODUCTOR MP4");
    }

}
