import javax.swing.*;
import java.awt.*;

public class Test01 {
    public Test01(){
        JFrame wd1= new JFrame("狗哥");
        JFrame wd2= new JFrame("狗哥");
        Container con =wd1.getContentPane();
        con.setBackground(Color.GREEN);
        wd1.setBounds(60,100,388,408);
        wd1.setBounds(260,100,488,508);
        wd1.setVisible(true);
        wd1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        wd2.setVisible(true);
        wd2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
