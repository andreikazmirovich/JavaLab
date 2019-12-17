import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Movement implements MouseListener, MouseMotionListener {

    private int X, Y;

    public Movement(JLabel label) {
        label.addMouseListener(this);
        label.addMouseMotionListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        X = e.getX();
        Y = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int newX = e.getX() + e.getComponent().getX() - X;
        int newY = e.getY() + e.getComponent().getY() - Y;
        e.getComponent().setLocation(newX, newY);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
