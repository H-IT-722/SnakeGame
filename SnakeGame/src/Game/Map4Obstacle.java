package Game;

import java.util.LinkedList;

public class Map4Obstacle {
    private LinkedList<Node> obstacle;

    public Map4Obstacle(){
        initMap4Obstacle();
    }

    private void initMap4Obstacle() {
        //创建集合
        obstacle=new LinkedList<>();
        for(int i=0;i<17;i++){
            obstacle.add(new Node(i,22));
        }
        for(int i=22;i<40;i++){
            obstacle.add(new Node(17,i));
        }
        for(int i=0;i<17;i++){
            obstacle.add(new Node(i,38));
        }
        for(int i=22;i<40;i++){
            obstacle.add(new Node(0,i));
        }

        for(int i=22;i<40;i++){
            obstacle.add(new Node(i,22));
        }
        for(int i=22;i<40;i++){
            obstacle.add(new Node(22,i));
        }
        for(int i=22;i<40;i++){
            obstacle.add(new Node(i,38));
        }
        for(int i=22;i<40;i++){
            obstacle.add(new Node(39,i));
        }

        for(int i=0;i<17;i++){
            obstacle.add(new Node(i,0));
        }
        for(int i=0;i<1;i++){
            obstacle.add(new Node(17,i));
        }
        for(int i=3;i<17;i++){
            obstacle.add(new Node(17,i));
        }
        for(int i=0;i<17;i++){
            obstacle.add(new Node(i,16));
        }
        for(int i=0;i<1;i++){
            obstacle.add(new Node(0,i));
        }
        for(int i=3;i<17;i++){
            obstacle.add(new Node(0,i));
        }

        for(int i=22;i<40;i++){
            obstacle.add(new Node(i,0));
        }
        for(int i=0;i<1;i++){
            obstacle.add(new Node(22,i));
        }
        for(int i=3;i<17;i++){
            obstacle.add(new Node(22,i));
        }
        for(int i=22;i<40;i++){
            obstacle.add(new Node(i,16));
        }
        for(int i=0;i<1;i++){
            obstacle.add(new Node(39,i));
        }
        for(int i=3;i<17;i++){
            obstacle.add(new Node(39,i));
        }

        for(int i=0;i<17;i++){
            obstacle.add(new Node(i,3));
        }

        for(int i=22;i<40;i++){
            obstacle.add(new Node(i,3));
        }
    }

    public LinkedList<Node> getObstacle() {
        return obstacle;
    }

    public void setObstacle(LinkedList<Node> obstacle) {
        this.obstacle = obstacle;
    }
}