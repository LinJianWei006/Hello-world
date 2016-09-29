package Lin;

import java.awt.*;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends JFrame{
 private static final long serialVersionUID = 1L;
    TextField f1;
    TextField f2;
    JButton b1;
    JButton b2;
    JButton b3;
    String power;// 表示权限
    Login() {
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4, 1));
        Label l1 = new Label("用户名");
        Label l2 = new Label("密   码");
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        f1 = new TextField(10);
        f2 = new TextField(10);
        f2.setEchoChar('*');
        b1 = new JButton("登录");
        b2 = new JButton("重置");
        b3 = new JButton("退出");
        p1.add(l1);
        p1.add(f1);
        p2.add(l2);
        p2.add(f2);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        cp.add(p1);
        cp.add(p2);
        cp.add(p3);
        b1.addActionListener(new Enter());
        b2.addActionListener(new ReWrite());
        b3.addActionListener(new Close());
    }
    public static void main(String[] args) {
        Login log = new Login();
        log.setTitle("系统登录");
        log.setSize(250, 180);
        log.setBackground(Color.blue);
        log.setVisible(true);
    }
    class Enter implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if ((f1.getText()).equals("ljw") && (f2.getText()).equals("ljw123")) {
                JOptionPane.showMessageDialog(null, "登录成功！用户权限是管理员");
                //登录成功必须转到登录界面
                Login.this.setVisible(false);
                ct.initGUI();
                power = "管理员";
            } else if ((f1.getText()).equals("abc") && (f2.getText()).equals("123456")) {
                JOptionPane.showMessageDialog(null, "登录成功!登录成功！用户权限是游客");
                //登录成功必须转到登录界面
                Login.this.setVisible(false);
                ct.initGUI();
                power = "游客";
            } else
                JOptionPane.showMessageDialog(null, "登录失败，请重新登录！");
        }
    }
    class ReWrite implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            f1.setText(""); 
            f2.setText("");
            f1.requestFocus();
        }
    }
    class Close implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton bt = (JButton) e.getSource();
            if (bt == b3)
                System.exit(0);
        }
    }
  // TODO 自动生成方法存根
 }
