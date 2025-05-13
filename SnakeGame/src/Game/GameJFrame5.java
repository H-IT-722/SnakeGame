package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.Timer;

public class GameJFrame5 extends JFrame implements KeyListener, ActionListener {

    //创建选项下的条目对象
    JMenuItem replayItem=new JMenuItem("重新游戏");
    JMenuItem closeItem=new JMenuItem("关闭游戏");

    JMenuItem creatorInformation=new JMenuItem("创作者信息");

    private Snake snake=new Snake();//蛇
    private JPanel jPanel;//游戏棋盘
    private Timer timer;//定时器,在指定时间调用蛇移动的方法
    private Node food;//食物
    private Map5Obstacle map5Obstacle=new Map5Obstacle();//地图5的障碍物


    public GameJFrame5(){

        initFrame();
        initJMenuBar();
        //初始化游戏棋盘
        initGamePanel();
        //初始化蛇
        initSnake();
        //初始化食物
        initFood();
        //初始化定时器
        initTimer();
    }

    //初始化食物
    private void initFood() {
        food = new Node();
        for (int i = 0; ; i++) {
            int panduan = 0;
            food.appearFood();
            LinkedList<Node> ob = map5Obstacle.getObstacle();
            for (Node node : ob) {
                if (food.getX() == node.getX() && food.getY() == node.getY()) {
                    panduan++;
                }
            }
            if (panduan == 0) {
                break;
            }
        }
    }


    //初始化定时器
    private void initTimer() {
        timer=new Timer();

        //初始化定时任务
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                snake.move();
                //判断蛇头是否和食物重合
                Node head=snake.getBody().getFirst();
                if(head.getX()==food.getX()&&head.getY()==food.getY()){
                    snake.eat();
                    for (int i = 0; ; i++) {
                        int panduan = 0;
                        food.appearFood();
                        LinkedList<Node> ob = map5Obstacle.getObstacle();
                        for (Node node : ob) {
                            if (food.getX() == node.getX() && food.getY() == node.getY()) {
                                panduan++;
                            }
                        }
                        if (panduan == 0) {
                            break;
                        }
                    }
                }
                //重绘游戏棋盘
                jPanel.repaint();
            }
        };

        //每100毫秒执行一次定时任务
        timer.scheduleAtFixedRate(timerTask,0,100);
    }

    //初始化蛇
    private void initSnake() {
        snake=new Snake();
    }


    //初始化游戏棋盘
    private void initGamePanel(){
        jPanel=new JPanel(){
            //绘制游戏棋盘内容
            @Override
            public void paint(Graphics g) {
                //清空棋盘
                g.clearRect(0, 0, 1000, 1000);

                //绘制横线
                for (int i = 0; i < 40; i++) {
                    g.drawLine(0, i * 25, 1000, i * 25);
                }
                //绘制竖线
                for (int i = 0; i < 40; i++) {
                    g.drawLine(i * 25, 0, i * 25, 1000);
                }
                //绘制蛇
                LinkedList<Node> body = snake.getBody();
                for (Node node : body) {
                    if (node.getX() == body.getFirst().getX() && node.getY() == body.getFirst().getY()) {
                        g.setColor(Color.MAGENTA);
                        g.fillRect(node.getX() * 25, node.getY() * 25, 25, 25);
                    } else {
                        g.setColor(Color.BLACK);
                        g.fillRect(node.getX() * 25, node.getY() * 25, 25, 25);
                    }
                }
                //绘制食物
                g.setColor(Color.RED);
                g.fillRect(food.getX() * 25, food.getY() * 25, 25, 25);
                //绘制障碍物
                LinkedList<Node> obstacle=map5Obstacle.getObstacle();
                for(Node node:obstacle){
                    g.setColor(Color.DARK_GRAY);
                    g.fillRect(node.getX()*25,node.getY()*25,25,25);
                }
            }
        };

        //把棋盘添加到窗体
        add(jPanel);
    }


    private void initFrame(){
        //设置宽高
        setSize(1010,1030);
        //设置界面标题
        this.setTitle("帅气的男人制作的贪吃蛇游戏");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //取消默认的居中放置
        //this.setLayout(null);//不能有，否则不会有横线竖线
        //加入键盘监听事件
        this.addKeyListener(this);
    }

    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar jMenuBar=new JMenuBar();

        //创建菜单上面的选项（功能   关于我们）
        JMenu functionJMenu=new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于我们");

        //将条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(creatorInformation);


        //给条目绑定事件
        replayItem.addActionListener(this);
        closeItem.addActionListener(this);
        creatorInformation.addActionListener(this);


        //将选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    //地图
    private final int[][] Board=new int[10][10];

    @Override
    public void actionPerformed(ActionEvent e) {
        //获得当前被点击的条目对象
        Object obj=e.getSource();
        if(obj==replayItem){

            repaint();
        } else if (obj==closeItem) {
            //直接关闭虚拟机
            System.exit(0);
        }else if(obj==creatorInformation){
            //创建弹框对象
            JDialog jDialog=new JDialog();
            //创建一个管理图片的容器对象JLabel
            JLabel jLabel=new JLabel(new StringBuilder().append("阳光、帅气、温柔、体贴、聪明、勤奋、勇敢、自信、").append("\n").append("幽默、善良、诚实、可靠、细心、大方、有责任心、有担当、乐观、积极、上进、成熟、").append("\n").append("稳重、风趣、有爱心、有耐心、有智慧、有才华、有魅力、有礼貌、有修养、有志向、有梦想").toString());
            //设置位置和宽高
            jLabel.setBounds(0,0,258,258);
            //把图片添加到弹框里
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(1300,200);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作页面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                if(snake.getDirection()!=Direction.DOWN){
                    snake.setDirection(Direction.UP);
                }
                break;
            case KeyEvent.VK_DOWN:
                if(snake.getDirection()!=Direction.UP){
                    snake.setDirection(Direction.DOWN);
                }
                break;
            case KeyEvent.VK_LEFT:
                if(snake.getDirection()!=Direction.RIGHT){
                    snake.setDirection(Direction.LEFT);
                }
                break;
            case KeyEvent.VK_RIGHT:
                if(snake.getDirection()!=Direction.LEFT){
                    snake.setDirection(Direction.RIGHT);
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
