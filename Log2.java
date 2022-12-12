import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Log2 extends JFrame implements ActionListener 
{
Container c;
JLabel lblUserName,lblPassword;
JTextField txtUserName;
JPasswordField txtPassword;
JButton btnSubmit,btnClear,btnExit;
String strUserName,strPassword;

Log2()
{
	c= getContentPane(); 
	// c.setLayout(new GridLayout());
	// c.setLayout(new CardLayout());
	c.setLayout(new FlowLayout());
	// to arrange the components in a line, one after another (in a flow).
	// It is the default layout of the applet or panel.
	lblUserName = new JLabel("User Name: "); 
	lblPassword = new JLabel("Password: "); 
	txtUserName = new JTextField(10); 
	txtPassword = new JPasswordField(10); 
	txtPassword.setEchoChar('*'); 
	btnSubmit = new JButton("Submit"); 
	btnClear = new JButton("Clear");
	btnExit = new JButton("Exit");
	c.add(lblUserName);
	c.add(txtUserName);
	c.add(lblPassword);
	c.add(txtPassword);
	c.add(btnSubmit);
	c.add(btnClear);
	c.add(btnExit);
	
	// this = obj i m working on right now
	btnSubmit.addActionListener(this);
	btnClear.addActionListener(this);
	btnExit.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource() == btnSubmit)
	{
		strUserName = txtUserName.getText();
		strPassword = txtPassword.getText();
		if(strUserName.equals("aayushi") && strPassword.equals("123"))
		{
			JOptionPane.showMessageDialog(c,"Successful Login");
			System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(c,"Unsuccessful Login");
			txtUserName.setText("");
			txtPassword.setText("");
			txtUserName.requestFocus();
			// by default cursor on username
		}
	}
	else if(ae.getSource() == btnClear)
	{
		txtUserName.setText("");
		txtPassword.setText("");
		txtUserName.requestFocus();
	}
	else
	{
		System.exit(0);
	}
	
}
public static void main(String z[])
{
	Log2 frm = new Log2();
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm.setBounds(200,200,450,250);
	frm.setVisible(true);
}

}
