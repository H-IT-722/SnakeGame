package Game;

import java.util.LinkedList;

public class Map1Obstacle {
    private LinkedList<Node> obstacle;

    public Map1Obstacle(){
        initMap1Obstacle();
    }

    private void initMap1Obstacle() {
        //创建集合
        obstacle=new LinkedList<>();
    }

    public LinkedList<Node> getObstacle() {
        return obstacle;
    }

    public void setObstacle(LinkedList<Node> obstacle) {
        this.obstacle = obstacle;
    }
}
