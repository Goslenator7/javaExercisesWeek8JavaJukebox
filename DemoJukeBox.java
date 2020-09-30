public class DemoJukeBox {
    public static void main(String[] args) {

        JukeBox myPlaylist = new JukeBox();

        Song s1 = new Song("Earthquake");
        Song s2 = new Song("Looking for Me");
        Song s3 = new Song("Highway to Hell");

        myPlaylist.addSong(s1);
        myPlaylist.addSong(s2);
        myPlaylist.addSong(s3);

        myPlaylist.size();
        myPlaylist.printPlaylist();
        myPlaylist.play();
        myPlaylist.size();
        myPlaylist.printPlaylist();
    }
}
