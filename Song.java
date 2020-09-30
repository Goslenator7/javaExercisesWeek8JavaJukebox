import javax.swing.*;

public class Song {

    private String title;

    // Constructor
    public Song(String title) {
        this.title = title;
    }

    public void displayTitle() {
        JOptionPane.showMessageDialog(null, this.getTitle());
    }

    // Getters and Setters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
