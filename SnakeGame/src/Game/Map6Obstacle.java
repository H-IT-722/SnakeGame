package Game;

import java.util.LinkedList;

public class Map6Obstacle {
    private LinkedList<Node> obstacle;

    public Map6Obstacle(){
        initMap6Obstacle();
    }

    private void initMap6Obstacle() {
        //创建集合
        obstacle=new LinkedList<>();
        obstacle.add(new Node(5,5));
        obstacle.add(new Node(15,5));
        obstacle.add(new Node(25,5));
        obstacle.add(new Node(35,5));
        obstacle.add(new Node(0,10));
        obstacle.add(new Node(10,10));
        obstacle.add(new Node(20,10));
        obstacle.add(new Node(30,10));
        obstacle.add(new Node(5,15));
        obstacle.add(new Node(15,15));
        obstacle.add(new Node(25,15));
        obstacle.add(new Node(35,15));
        obstacle.add(new Node(39,20));
        obstacle.add(new Node(29,20));
        obstacle.add(new Node(19,20));
        obstacle.add(new Node(9,20));
        obstacle.add(new Node(5,25));
        obstacle.add(new Node(15,25));
        obstacle.add(new Node(25,25));
        obstacle.add(new Node(35,25));
        obstacle.add(new Node(39,30));
        obstacle.add(new Node(29,30));
        obstacle.add(new Node(19,30));
        obstacle.add(new Node(9,30));
    }

    public LinkedList<Node> getObstacle() {
        return obstacle;
    }

    public void setObstacle(LinkedList<Node> obstacle) {
        this.obstacle = obstacle;
    }
}
