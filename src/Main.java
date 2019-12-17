import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JLabel text;

    public Main() {
        setLayout(null);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Movement mv = new Movement(createText());

        setVisible(true);
    }

    private JLabel createText() {
        text = new JLabel("Random text");
        Dimension size = text.getPreferredSize();
        text.setBounds(20, 20, size.width, size.height);
        add(text);

        return text;
    }

    public static void main(String args[]) {
        new Main();
    }
}
