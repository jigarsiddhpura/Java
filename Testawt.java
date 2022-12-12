import java.awt.*;
public class Testawt{
    Testawt()
    {
        Frame fm = new Frame();
        Label lb = new Label("Welcome to java GUI");
        fm.add(lb);
        fm.setSize(500,500);
        fm.setVisible(true);
    }
    public static void main(String args[]){
        Testawt ta = new Testawt();
    }
}