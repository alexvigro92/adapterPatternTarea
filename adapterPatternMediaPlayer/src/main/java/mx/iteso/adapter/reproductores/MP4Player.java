package mx.iteso.adapter.reproductores;

import mx.iteso.adapter.AdvancedMediaPlayer;

/**
 * Created by mavg_ on 11/9/2015.
 */
public class MP4Player implements AdvancedMediaPlayer {
    public String playVLC(String VLCArchivo) {
        System.out.println("REPRODUCIENDO EL ARCHIVO " + VLCArchivo + " CON EL REPRODUCTOR MP4");
        return "REPRODUCIENDO EL ARCHIVO " + VLCArchivo + " CON EL REPRODUCTOR MP4";
    }

    public String playMP4(String MP4Archivo) {
        System.out.println("REPRODUCIENDO EL ARCHIVO " + MP4Archivo + " CON EL REPRODUCTOR MP4");
        return "REPRODUCIENDO EL ARCHIVO " + MP4Archivo + " CON EL REPRODUCTOR MP4";
    }
}
