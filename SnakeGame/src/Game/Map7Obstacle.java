package Game;

import java.util.LinkedList;

public class Map7Obstacle {
    private LinkedList<Node> obstacle;

    public Map7Obstacle(){
        initMap7Obstacle();
    }

    private void initMap7Obstacle() {
        //创建集合
        obstacle=new LinkedList<>();
        obstacle.add(new Node(8,8));
        obstacle.add(new Node(8,9));
        obstacle.add(new Node(9,8));
        obstacle.add(new Node(9,9));

        obstacle.add(new Node(31,8));
        obstacle.add(new Node(31,9));
        obstacle.add(new Node(30,8));
        obstacle.add(new Node(30,9));

        obstacle.add(new Node(8,31));
        obstacle.add(new Node(8,30));
        obstacle.add(new Node(9,31));
        obstacle.add(new Node(9,30));

        obstacle.add(new Node(31,31));
        obstacle.add(new Node(31,30));
        obstacle.add(new Node(30,31));
        obstacle.add(new Node(30,30));
    }

    public LinkedList<Node> getObstacle() {
        return obstacle;
    }

    public void setObstacle(LinkedList<Node> obstacle) {
        this.obstacle = obstacle;
    }
}
