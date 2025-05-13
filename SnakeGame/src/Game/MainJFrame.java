package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainJFrame extends JFrame implements ActionListener {

    public MainJFrame(){
        initJFrame();

        createButton();

        setVisible(true);
    }

    private void initJFrame(){
        setSize(500,500);
        setTitle("帅气的男生制作的小游戏");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel text=new JLabel("请选择您想玩的模式");
        text.setFont(new Font("微软雅黑",0,50));
        text.setBounds(20,50,500,70);
        add(text);
    }

    private void createButton(){
        JButton jButton1=new JButton("单人模式");
        JButton jButton2=new JButton("双人模式");
        jButton1.setBounds(100,190,300,120);
        jButton2.setBounds(100,340,300,120);
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        add(jButton1);
        add(jButton2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command=e.getActionCommand();

        switch (command){
            case "单人模式":
                new mainJFrame1().setVisible(true);
                break;

            case "双人模式":
                new mainJFrame2().setVisible(true);
                break;
        }
    }
}
