import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class JukeBox {

    private ArrayList <Song> songs = new ArrayList<Song>();

    public void addSong(Song title) {
        this.songs.add(title);
    }

    public void play() {
        String playingMessage = "Now playing: "+songs.get(0).getTitle();
        JOptionPane.showMessageDialog(null, playingMessage);
        songs.remove(0);
    }

    public void printPlaylist() {
        for (Song tempSong : songs) {
            tempSong.displayTitle();
        }
    }

    public void size() {
        String sizeMessage = "The number of songs in the playlist is: "+songs.size()+".";
        JOptionPane.showMessageDialog(null, sizeMessage);
    }

    public void addSongs(Collection <Song> songs) {
        songs.addAll(songs);
    }
}
