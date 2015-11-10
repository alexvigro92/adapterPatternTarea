package mx.iteso.adapter.reproductorAudio;

import mx.iteso.adapter.MediaAdapter;
import mx.iteso.adapter.MediaPlayer;

/**
 * Created by mavg_ on 11/9/2015.
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapterThis;

    public AudioPlayer(MediaAdapter mediaAdapter){
    this.mediaAdapterThis = mediaAdapter;
    }

    public String play(String Archivo) {
        if (Archivo.endsWith(".mp3")) {
            System.out.println("REPRODUCIENDO EL ARCHIVO " + Archivo + " CON EL REPRODUCTOR MP3");
            return "REPRODUCIENDO EL ARCHIVO " + Archivo + " CON EL REPRODUCTOR MP3";
        } else {
            return mediaAdapterThis.play(Archivo);
        }
    }
}
