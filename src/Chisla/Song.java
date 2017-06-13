package Chisla;

/**
 * Created by voca on 30.05.17.
 */
public class Song {
     String title;
    String artist;

    public static void main(String[] args) {

        Song gg = new Song();
        final Song ff = new Song();
        Song dd = new Song();
        Song ss = new Song();
       gg.setTitle("Diki komar" );
       gg.setArtist("pyanaya vosh");
       gg.play();
       ff.artist = "gopa";
       ff.title = "lebedi";
       ff.play();
       ff.setTitle("hrom");
       ff.setArtist("k");
       ff.play();
       ss=ff;
       ss.play();
       //ff=null;





    }

    public final void setTitle(final String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void play(){
        System.out.println("igraet pestnay " + title +" " + artist);
    }
}
