package Lin;

import java.awt.*;
import java.awt.event.*;
public class ct extends Frame implements ActionListener
{
   
    static ct frm=new ct();

   
   public static void initGUI(){
        frm.setTitle("管理员界面");

        frm.setSize(400,400);
        frm.setBackground(Color.blue);
//        frm.setMenuBar(mb);
        frm.setVisible(true);
    }
   
    public static void main(String args[])
    {
        initGUI();
    }
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
    public void windowClosing(WindowEvent e)
    {
        frm.dispose();
        System.exit(0);
    }
 
}
