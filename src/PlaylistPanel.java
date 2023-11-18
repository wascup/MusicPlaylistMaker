import javax.swing.*;
import java.awt.*;

public class PlaylistPanel extends JPanel {
    Color bg = Color.decode("#222222");
    Color fg = Color.decode("#FFFFFF");
    JList<String> playlist = new JList<String>();
    JButton addSong = new JButton("Add Song");
    JButton removeSong = new JButton("Remove Song");
    JButton savePlaylist = new JButton("Save List");
    public PlaylistPanel() {
        super();
        setSize(600,800);
        setBackground(bg);
        setForeground(fg);
        addButtons();
        setVisible(true);

    }


    void addButtons() {

    }


}
