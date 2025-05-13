package Game;

import java.util.LinkedList;

public class Map3Obstacle {
    private LinkedList<Node> obstacle;

    public Map3Obstacle(){
        initMap3Obstacle();
    }

    private void initMap3Obstacle() {
        //创建集合
        obstacle=new LinkedList<>();
        for(int i=0;i<17;i++){
            obstacle.add(new Node(i,23));
        }
        for(int i=23;i<40;i++){
            obstacle.add(new Node(17,i));
        }

        for(int i=22;i<40;i++){
            obstacle.add(new Node(i,13));
        }
        for(int i=13;i<40;i++){
            obstacle.add(new Node(21,i));
        }

        for(int i=3;i<11;i++){
            obstacle.add(new Node(i,9));
        }
        for(int i=3;i<9;i++){
            obstacle.add(new Node(10,i));
        }

        for(int i=29;i<37;i++){
            obstacle.add(new Node(i,9));
        }
        for(int i=3;i<9;i++){
            obstacle.add(new Node(29,i));
        }

        for(int i=21;i<40;i++){
            obstacle.add(new Node(i,0));
        }
    }

    public LinkedList<Node> getObstacle() {
        return obstacle;
    }

    public void setObstacle(LinkedList<Node> obstacle) {
        this.obstacle = obstacle;
    }
}
