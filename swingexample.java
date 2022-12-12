import java.util.*;
import java.lang.*;
import javax.swing.*;
// events r not defined in awt 

// javax includes advance functions while java includes basic java functions
// swing is extension of awt
// java platform independent
// jsp = java server pages
// asp = active server pages 

import java.awt.event.*;
class swingexample
{
	public static void main(String args[])
	{
		JFrame f = new JFrame();
		JButton b = new JButton("click");
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		b.setBounds(100,100,100,100);
	}
}

