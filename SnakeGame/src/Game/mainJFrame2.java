package Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainJFrame2 extends JFrame implements ActionListener {
    public static int p=1;

    public mainJFrame2(){
        initJFrame();

        createButton();

        setVisible(true);
    }

    private void initJFrame(){
        setSize(500,550);
        setTitle("帅气的男生制作的小游戏");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
    }

    private void createButton(){
        JButton jButton1=new JButton("平地(有边界)");
        JButton jButton2=new JButton("地狱(无边界)");
        JButton jButton3=new JButton("天堂(无边界)");
        JButton jButton4=new JButton("魔法学院(无边界)");
        JButton jButton5=new JButton("双人经典(无边界)");
        jButton1.setBounds(100,0,300,100);
        jButton2.setBounds(100,100,300,100);
        jButton3.setBounds(100,200,300,100);
        jButton4.setBounds(100,300,300,100);
        jButton5.setBounds(100,400,300,100);
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jButton4);
        add(jButton5);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command=e.getActionCommand();

        switch (command){
            case "平地(有边界)":
                Snake.setoNum(1);
                p=2;
                new GameJFrame1().setVisible(true);
                break;

            case "地狱(无边界)":
                Snake.setoNum(2);
                p=2;
                new GameJFrame2().setVisible(true);
                break;

            case "天堂(无边界)":
                Snake.setoNum(3);
                p=2;
                new GameJFrame3().setVisible(true);
                break;

            case "魔法学院(无边界)":
                Snake.setoNum(4);
                p=2;
                new GameJFrame4().setVisible(true);
                break;
            case "双人经典(无边界)":
                Snake.setoNum(9);
                p=2;
                new GameJFrame9().setVisible(true);
                break;
        }
    }
}
