package mx.iteso.adapter;

/**
 * Created by mavg_ on 11/9/2015.
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedPayerThis;

    public MediaAdapter (AdvancedMediaPlayer advanceMediaPlayer)
    {
        this.advancedPayerThis = advanceMediaPlayer;
    }

    public String play(String Archivo) {
        if(Archivo.endsWith(".mp4")){
            return advancedPayerThis.playMP4(Archivo);
        }else if(Archivo.endsWith(".vlc")){
            return advancedPayerThis.playVLC(Archivo);
        }else{
            System.out.println("FORMATO NO ACEPTADO");
            return "FORMATO NO ACEPTADO";
        }

    }
}
