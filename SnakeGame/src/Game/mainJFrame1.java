package Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Game.mainJFrame2.p;
public class mainJFrame1 extends JFrame implements ActionListener {

    public mainJFrame1(){
        initJFrame();

        createButton();

        setVisible(true);
    }

    private void initJFrame(){
        setSize(500,850);
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
        JButton jButton5=new JButton("一年神魔(无边界)");
        JButton jButton6=new JButton("陨石危机(无边界)");
        JButton jButton7=new JButton("急速模式(无边界)");
        JButton jButton8=new JButton("极速模式(无边界)");
        jButton1.setBounds(100,0,300,100);
        jButton2.setBounds(100,100,300,100);
        jButton3.setBounds(100,200,300,100);
        jButton4.setBounds(100,300,300,100);
        jButton5.setBounds(100,400,300,100);
        jButton6.setBounds(100,500,300,100);
        jButton7.setBounds(100,600,300,100);
        jButton8.setBounds(100,700,300,100);
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
        jButton6.addActionListener(this);
        jButton7.addActionListener(this);
        jButton8.addActionListener(this);
        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jButton4);
        add(jButton5);
        add(jButton6);
        add(jButton7);
        add(jButton8);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command=e.getActionCommand();

        switch (command){
            case "平地(有边界)":
                Snake.setoNum(1);
                p=1;
                new GameJFrame1().setVisible(true);
                break;

            case "地狱(无边界)":
                Snake.setoNum(2);
                p=1;
                new GameJFrame2().setVisible(true);
                break;

            case "天堂(无边界)":
                Snake.setoNum(3);
                p=1;
                new GameJFrame3().setVisible(true);
                break;

            case "魔法学院(无边界)":
                Snake.setoNum(4);
                p=1;
                new GameJFrame4().setVisible(true);
                break;

            case "一年神魔(无边界)":
                Snake.setoNum(5);
                p=1;
                new GameJFrame5().setVisible(true);
                break;

            case "陨石危机(无边界)":
                Snake.setoNum(6);
                p=1;
                new GameJFrame6().setVisible(true);
                break;

            case "急速模式(无边界)":
                Snake.setoNum(7);
                p=1;
                new GameJFrame7().setVisible(true);
                break;

            case "极速模式(无边界)":
                Snake.setoNum(8);
                p=1;
                new GameJFrame8().setVisible(true);
                break;
        }
    }
}
