import javazoom.jl.player.advanced.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import javazoom.jl.decoder.*;

public class JLayerTest
{
	public static void analiziraj(int n) throws FileNotFoundException, DecoderException, BitstreamException{
        int i = 0;
        Bitstream bitStream = new Bitstream(new FileInputStream("test.mp3"));
        while(i < n){
            Decoder decoder = new Decoder();
            Obuffer samples = decoder.decodeFrame(bitStream.readFrame(), bitStream); //returns the next 2304 samples
            bitStream.closeFrame();
            System.out.println(samples);
            System.out.println(decoder.getOutputFrequency());
            
            i++;
        }
		
	}
	
    public static void main(String[] args) throws FileNotFoundException, DecoderException, BitstreamException
    {
        SoundJLayer soundToPlay = new SoundJLayer("test.mp3");

        soundToPlay.play();

        //int a = dasd.getOutputFrequency();
        analiziraj(2304);
        
    }
}

class SoundJLayer extends PlaybackListener implements Runnable
{
    private String filePath;
    private AdvancedPlayer player;
    private Thread playerThread;    

    public SoundJLayer(String filePath)
    {
        this.filePath = filePath;
    }

    public void play()
    {
        try
        {
            String urlAsString = 
                "file:///" 
                + new java.io.File(".").getCanonicalPath() 
                + "/" 
                + this.filePath;

            this.player = new AdvancedPlayer
            (
                new java.net.URL(urlAsString).openStream(),
                javazoom.jl.player.FactoryRegistry.systemRegistry().createAudioDevice()
            );

            this.player.setPlayBackListener(this);

            this.playerThread = new Thread(this, "AudioPlayerThread");

            this.playerThread.start();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    // PlaybackListener members

    public void playbackStarted(PlaybackEvent playbackEvent)
    {
        System.out.println("playbackStarted()");
    }

    public void playbackFinished(PlaybackEvent playbackEvent)
    {
        System.out.println("playbackEnded()");
    }    

    // Runnable members

    public void run()
    {
        try
        {
            this.player.play();
        }
        catch (javazoom.jl.decoder.JavaLayerException ex)
        {
            ex.printStackTrace();
        }

    }
}