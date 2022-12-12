import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MListener extends JFrame implements MouseListener {

  Container c;
  JTextArea txt1;

  MListener() {
    c = getContentPane();
    // c.setLayout(new FlowLayout());
    txt1 = new JTextArea(50, 50);
    c.add(txt1);
    txt1.addMouseListener(this);
  }

// MouseEvent is a class , mousePressed is a method
  public void mousePressed(MouseEvent e) {
    txt1.append("MP \n");
  }

  public void mouseReleased(MouseEvent e) {
    txt1.append("MR \n");
  }

  public void mouseEntered(MouseEvent e) {
    txt1.append("MEn \n");
  }

  public void mouseExited(MouseEvent e) {
    txt1.append("MEx \n");
  }

  public void mouseClicked(MouseEvent e) {
    txt1.append("MC \n");
  }

  // mouse enter or exit in that AREA

  public static void main(String z[]) {
    MListener k = new MListener();
    k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    k.setBounds(700, 300, 300, 200);
    k.setTitle("Mouse Events");
    k.setVisible(true);
  }
}
