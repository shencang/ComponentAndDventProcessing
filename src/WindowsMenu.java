import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class WindowsMenu extends JFrame{
    JMenuBar menuBar;
    JMenu    menu,subMenu;
    JMenuItem item1,item2;

    public WindowsMenu(){

    }
    public WindowsMenu(String s,int x,int y,int w,int h){
        init(s);
        setLocation(x,y);
        setSize(w,h);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


    }
    void init(String s){
        setTitle(s);
        menuBar = new JMenuBar();
        menu = new JMenu("菜单");
        subMenu = new JMenu("软件项目");
        item1= new JMenuItem("java话题",new ImageIcon("s2.png"));
        item2= new JMenuItem("动画话题",new ImageIcon("s2.png"));

        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        menu.add(subMenu);

        subMenu.add(new JMenuItem("汽车销售系统",new ImageIcon("s2.png")));
        subMenu.add(new JMenuItem("农场销售系统",new ImageIcon("s2.png")));
        menuBar.add(menu);
        setJMenuBar(menuBar);

    }



}
