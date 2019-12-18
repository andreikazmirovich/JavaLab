import org.junit.Before;
import org.junit.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.Assert.*;

public class MainTest {
    Main mainClass;
    JLabel text;

    @Before
    public void init() {
        mainClass = new Main();
        text = mainClass.createText();
    }

    @Test
    public void createLabelWithRightText() {
        String expectedText = "Changed text";
        assertEquals(expectedText, text.getText());
    }

    @Test
    public void createLabelWithRightPosition() {
        Dimension size = text.getPreferredSize();
        Rectangle position = text.getBounds();

        assertEquals(position.x, 20);
        assertEquals(position.y, 20);
        assertEquals(position.width, size.width);
        assertEquals(position.height, size.height);
    }
}