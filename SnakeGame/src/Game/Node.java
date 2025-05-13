package Game;
import java.util.LinkedList;
import java.util.Random;

public class Node {
    private int x;
    private int y;

    public Node(){

    }

    public Node(int x,int y){
        this.x=x;
        this.y=y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //随机生成食物位置
    public void appearFood() {
        Random random = new Random();
        //生成横坐标
        this.x = random.nextInt(40);
        //生成纵坐标
        this.y = random.nextInt(40);
    }
}
