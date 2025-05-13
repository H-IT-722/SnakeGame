package Game;

import java.util.LinkedList;
import java.util.Random;

public class Map9Obstacle {
    private LinkedList<Node> obstacle;

    public Map9Obstacle(){
        initMap9Obstacle();
    }

    private void initMap9Obstacle() {
        //创建集合
        obstacle=new LinkedList<>();

        for(int i=5;i<15;i++){
            obstacle.add(new Node(i,5));
            obstacle.add(new Node(5,i));
        }
        for(int i=25;i<35;i++){
            obstacle.add(new Node(i,33));
            obstacle.add(new Node(34,i-1));
        }
        for(int i=5;i<15;i++){
            obstacle.add(new Node(i,33));
            obstacle.add(new Node(5,i+19));
        }
        for(int i=25;i<35;i++){
            obstacle.add(new Node(i,5));
            obstacle.add(new Node(34,i-20));
        }

        for(int i=16;i<23;i++){
            obstacle.add(new Node(11,i));
        }
        for(int i=16;i<24;i++){
            obstacle.add(new Node(i,11));
        }
        for(int i=16;i<24;i++){
            obstacle.add(new Node(i,27));
        }
        for(int i=16;i<23;i++){
            obstacle.add(new Node(28,i));
        }

        obstacle.add(new Node(19,19));
        obstacle.add(new Node(20,19));
        obstacle.add(new Node(19,20));
        obstacle.add(new Node(20,20));
    }

    public LinkedList<Node> getObstacle() {
        return obstacle;
    }

    public void setObstacle(LinkedList<Node> obstacle) {
        this.obstacle = obstacle;
    }
}
