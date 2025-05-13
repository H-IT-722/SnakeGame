package Game;

import java.util.LinkedList;

//一条蛇有多个节点，使用LinkedLIst集合存储Node节点，蛇出生时有6个节点
public class Snake2 {
    //蛇的身体
    private LinkedList<Node> body;
    //蛇的运动方向
    private Direction direction=Direction.RIGHT;
    //蛇是否活着
    boolean isLiving=true;
    //撞墙是否死亡
    private boolean isZhuangSi=false;
    //是否有传送门
    private boolean isChuanSong=false;
    private Map2Obstacle map2Obstacle=new Map2Obstacle();//地图2的障碍物
    private Map3Obstacle map3Obstacle=new Map3Obstacle();//地图3的障碍物
    private Map4Obstacle map4Obstacle=new Map4Obstacle();//地图4的障碍物
    private Map5Obstacle map5Obstacle=new Map5Obstacle();//地图5的障碍物
    private Map6Obstacle map6Obstacle=new Map6Obstacle();//地图6的障碍物
    private Map7Obstacle map7Obstacle=new Map7Obstacle();//地图7的障碍物
    private Map9Obstacle map9Obstacle=new Map9Obstacle();//地图9的障碍物


    public Snake2(){
        //初始化蛇身体
        initSnake2();
    }

    private void initSnake2() {
        //创建集合
        body=new LinkedList<>();
        //创建7个节点，添加到集合中
        for(int i=10;i>=1;i--){
            body.add(new Node(i,1));
        }
    }

    //蛇会沿着蛇头的方向移动
    //蛇头运动方向添加一个节点，尾部节点删除
    public void move(){
        Node head=body.getFirst();
        if(isLiving&&(head.getX()>=0||head.getY()>=0||head.getX()<40||head.getY()<40)) {
            switch (direction) {
                case UP:
                    body.addFirst(new Node(head.getX(), head.getY() - 1));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(), head.getY() + 1));
                    break;
                case LEFT:
                    body.addFirst(new Node(head.getX() - 1, head.getY()));
                    break;
                case RIGHT:
                    body.addFirst(new Node(head.getX() + 1, head.getY()));
                    break;
            }
            //删除尾节点
            body.removeLast();
        }

        if(isLiving&&(head.getX()<0||head.getY()<0||head.getX()>39||head.getY()>39)&&!isZhuangSi){
            switch (direction) {
                case UP:
                    body.addFirst(new Node(head.getX(), 39));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(), 0));
                    break;
                case LEFT:
                    body.addFirst(new Node(39, head.getY()));
                    break;
                case RIGHT:
                    body.addFirst(new Node(0, head.getY()));
                    break;
            }
            //删除尾节点
            body.removeLast();
        }


        //碰到传送门
        if(isLiving&&head.getX()==5&&head.getY()==18&&isChuanSong){
            body.addFirst(new Node(9, 10));
            //删除尾节点
            body.removeLast();

            head=body.getFirst();
            switch (direction) {
                case UP:
                    body.addFirst(new Node(head.getX(), head.getY() - 1));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(), head.getY() + 1));
                    break;
                case LEFT:
                    body.addFirst(new Node(head.getX() - 1, head.getY()));
                    break;
                case RIGHT:
                    body.addFirst(new Node(head.getX() + 1, head.getY()));
                    break;
            }
            //删除尾节点
            body.removeLast();
        }else if (isLiving&&head.getX()==9&&head.getY()==10&&isChuanSong) {
            body.addFirst(new Node(5, 18));

            head=body.getFirst();
            switch (direction) {
                case UP:
                    body.addFirst(new Node(head.getX(), head.getY() - 1));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(), head.getY() + 1));
                    break;
                case LEFT:
                    body.addFirst(new Node(head.getX() - 1, head.getY()));
                    break;
                case RIGHT:
                    body.addFirst(new Node(head.getX() + 1, head.getY()));
                    break;
            }
            //删除尾节点
            body.removeLast();
        }else if (isLiving&&head.getX()==5&&head.getY()==20&&isChuanSong) {
            body.addFirst(new Node(9, 30));

            head=body.getFirst();
            switch (direction) {
                case UP:
                    body.addFirst(new Node(head.getX(), head.getY() - 1));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(), head.getY() + 1));
                    break;
                case LEFT:
                    body.addFirst(new Node(head.getX() - 1, head.getY()));
                    break;
                case RIGHT:
                    body.addFirst(new Node(head.getX() + 1, head.getY()));
                    break;
            }
            //删除尾节点
            body.removeLast();
        }else if (isLiving&&head.getX()==9&&head.getY()==30&&isChuanSong) {
            body.addFirst(new Node(5, 20));

            head=body.getFirst();
            switch (direction) {
                case UP:
                    body.addFirst(new Node(head.getX(), head.getY() - 1));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(), head.getY() + 1));
                    break;
                case LEFT:
                    body.addFirst(new Node(head.getX() - 1, head.getY()));
                    break;
                case RIGHT:
                    body.addFirst(new Node(head.getX() + 1, head.getY()));
                    break;
            }
            //删除尾节点
            body.removeLast();
        }else if (isLiving&&head.getX()==34&&head.getY()==18&&isChuanSong) {
            body.addFirst(new Node(30, 10));

            head=body.getFirst();
            switch (direction) {
                case UP:
                    body.addFirst(new Node(head.getX(), head.getY() - 1));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(), head.getY() + 1));
                    break;
                case LEFT:
                    body.addFirst(new Node(head.getX() - 1, head.getY()));
                    break;
                case RIGHT:
                    body.addFirst(new Node(head.getX() + 1, head.getY()));
                    break;
            }
            //删除尾节点
            body.removeLast();
        }else if (isLiving&&head.getX()==30&&head.getY()==10&&isChuanSong) {
            body.addFirst(new Node(34, 18));

            head=body.getFirst();
            switch (direction) {
                case UP:
                    body.addFirst(new Node(head.getX(), head.getY() - 1));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(), head.getY() + 1));
                    break;
                case LEFT:
                    body.addFirst(new Node(head.getX() - 1, head.getY()));
                    break;
                case RIGHT:
                    body.addFirst(new Node(head.getX() + 1, head.getY()));
                    break;
            }
            //删除尾节点
            body.removeLast();
        }else if (isLiving&&head.getX()==34&&head.getY()==20&&isChuanSong) {
            body.addFirst(new Node(30, 30));

            head=body.getFirst();
            switch (direction) {
                case UP:
                    body.addFirst(new Node(head.getX(), head.getY() - 1));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(), head.getY() + 1));
                    break;
                case LEFT:
                    body.addFirst(new Node(head.getX() - 1, head.getY()));
                    break;
                case RIGHT:
                    body.addFirst(new Node(head.getX() + 1, head.getY()));
                    break;
            }
            //删除尾节点
            body.removeLast();
        }else if (isLiving&&head.getX()==30&&head.getY()==30&&isChuanSong) {
            body.addFirst(new Node(34, 20));

            head=body.getFirst();
            switch (direction) {
                case UP:
                    body.addFirst(new Node(head.getX(), head.getY() - 1));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(), head.getY() + 1));
                    break;
                case LEFT:
                    body.addFirst(new Node(head.getX() - 1, head.getY()));
                    break;
                case RIGHT:
                    body.addFirst(new Node(head.getX() + 1, head.getY()));
                    break;
            }
            //删除尾节点
            body.removeLast();
        }


        //判断蛇是否撞墙
        head=body.getFirst();
        if(head.getX()<0||head.getY()<0||head.getX()>=40||head.getY()>=40){
            if(isZhuangSi){
                isLiving=false;
            }
        }

        //判断蛇是否撞到自己身体
        for (int i = 1; i < body.size(); i++) {
            Node node=body.get(i);
            if(head.getX()==node.getX()&&head.getY()==node.getY()){
                isLiving=false;
            }
        }


        //是否撞到障碍物
        if(Snake.getoNum()==1){

        } else if (Snake.getoNum()==2) {
            LinkedList<Node> obstacle=map2Obstacle.getObstacle();
            for(Node node:obstacle){
                if(head.getX()==node.getX()&&head.getY()== node.getY()){
                    isLiving=false;
                }
            }
        } else if (Snake.getoNum()==3) {
            LinkedList<Node> obstacle=map3Obstacle.getObstacle();
            for(Node node:obstacle){
                if(head.getX()==node.getX()&&head.getY()== node.getY()){
                    isLiving=false;
                }
            }
        }else if (Snake.getoNum()==4) {
            LinkedList<Node> obstacle=map4Obstacle.getObstacle();
            for(Node node:obstacle){
                if(head.getX()==node.getX()&&head.getY()== node.getY()){
                    isLiving=false;
                }
            }
        }else if (Snake.getoNum()==5) {
            LinkedList<Node> obstacle=map5Obstacle.getObstacle();
            for(Node node:obstacle){
                if(head.getX()==node.getX()&&head.getY()== node.getY()){
                    isLiving=false;
                }
            }
        }else if (Snake.getoNum()==6) {
            LinkedList<Node> obstacle=map6Obstacle.getObstacle();
            for(Node node:obstacle){
                if(head.getX()==node.getX()&&head.getY()== node.getY()){
                    isLiving=false;
                }
            }
        }else if (Snake.getoNum()==7) {
            LinkedList<Node> obstacle=map7Obstacle.getObstacle();
            for(Node node:obstacle){
                if(head.getX()==node.getX()&&head.getY()== node.getY()){
                    isLiving=false;
                }
            }
        } else if (Snake.getoNum()==8) {

        }else if (Snake.getoNum()==9) {
            LinkedList<Node> obstacle = map9Obstacle.getObstacle();
            for (Node node : obstacle) {
                if (head.getX() == node.getX() && head.getY() == node.getY()) {
                    isLiving = false;
                }
            }
        }
    }

    public LinkedList<Node> getBody() {
        return body;
    }

    public void setBody(LinkedList<Node> body) {
        this.body = body;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean isZhuangSi() {
        return isZhuangSi;
    }

    public void setZhuangSi(boolean zhuangSi) {
        isZhuangSi = zhuangSi;
    }

    public boolean getisChuanSong(){
        return isChuanSong;
    }

    public void setChuanSong(boolean chuanSong) {
        isChuanSong = chuanSong;
    }


    //沿着蛇头方向添加一个节点
    public void eat() {
        Node head=body.getFirst();
        switch (direction){
            case UP:
                body.addFirst(new Node(head.getX(),head.getY()-1));
                break;
            case DOWN:
                body.addFirst(new Node(head.getX(),head.getY()+1));
                break;
            case LEFT:
                body.addFirst(new Node(head.getX()-1,head.getY()));
                break;
            case RIGHT:
                body.addFirst(new Node(head.getX()+1,head.getY()));
                break;
        }
    }
}
