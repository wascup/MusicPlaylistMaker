import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }
    public Main() {
        super("Playlist Maker");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600,800);
        setLocationRelativeTo(null);
        setVisible(true);
        add(new PlaylistPanel());
    }
}