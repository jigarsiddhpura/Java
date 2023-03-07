import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginForm extends JFrame implements ActionListener {

  Container c;
  JLabel lPassword, lEmail;
  JTextField txtEmail;
  JPasswordField txtPassword;
  JButton btnSubmit, btnClear;
  String strPassword, strEmail;

  LoginForm() {
    c = getContentPane();
    c.setLayout(new FlowLayout());
    // labels
    lPassword = new JLabel("Password: ");
    lEmail = new JLabel("Email: ");
    // text fields
    txtEmail = new JTextField(10);
    txtPassword = new JPasswordField(10);
    txtPassword.setEchoChar('*');
    // buttons
    btnSubmit = new JButton("OK");
    btnClear = new JButton("Reset");
    c.add(lEmail);
    c.add(txtEmail);
    c.add(lPassword);
    c.add(txtPassword);
    c.add(btnSubmit);
    c.add(btnClear);
    btnSubmit.addActionListener(this);
    btnClear.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == btnSubmit) {
      strPassword = txtPassword.getText();
      strEmail = txtEmail.getText();
      if (
        strPassword.equals("Jigar") && strEmail.equals("jigar@gmail.com")
      ) {
        JOptionPane.showMessageDialog(c, "Successful Login");
        System.exit(0);
      } else {
        JOptionPane.showMessageDialog(c, "Unsuccessful Login");
        txtEmail.setText("");
        txtPassword.setText("");
      }
    } else if (ae.getSource() == btnClear) {
      txtPassword.setText("");
      txtEmail.setText("");
    }
  }

  public static void main(String z[]) {
    LoginForm frm = new LoginForm();
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setBounds(200, 200, 550, 200);
    frm.setVisible(true);
    frm.setTitle("LOGIN");
  }
}
