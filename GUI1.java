import javax.swing.*;
class GUI1 {
    public static void main(String[] args) {        
        JFrame jf=new JFrame();
        jf.setVisible(true);
        // by default is invisible
        jf.setSize(500, 500);
        jf.setTitle("My First Frame");
        jf.setLocation(200, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}