package Game;

import java.util.LinkedList;
import java.util.Random;

public class Map2Obstacle {
    private LinkedList<Node> obstacle;

    public Map2Obstacle(){
        initMap2Obstacle();
    }

    private void initMap2Obstacle() {
        //创建集合
        obstacle=new LinkedList<>();
        for(int i=0;i<5;i++){
            obstacle.add(new Node(i,4));
        }
        for(int i=8;i<19;i++){
            obstacle.add(new Node(i,4));
        }
        for(int i=21;i<32;i++){
            obstacle.add(new Node(i,4));
        }
        for(int i=35;i<40;i++){
            obstacle.add(new Node(i,4));
        }

        for(int i=0;i<5;i++){
            obstacle.add(new Node(i,34));
        }
        for(int i=8;i<19;i++){
            obstacle.add(new Node(i,34));
        }
        for(int i=21;i<32;i++){
            obstacle.add(new Node(i,34));
        }
        for(int i=35;i<40;i++){
            obstacle.add(new Node(i,34));
        }

        for(int i=19;i<21;i++){
            for(int j=8;j<31;j++){
                obstacle.add(new Node(i,j));
            }
        }

        for(int i=8;i<16;i++){
            obstacle.add(new Node(2,i));
        }
        for(int i=8;i<16;i++){
            obstacle.add(new Node(10,i));
        }
        for(int i=2;i<11;i++){
            obstacle.add(new Node(i,17));
        }

        for(int i=8;i<16;i++){
            obstacle.add(new Node(29,i));
        }
        for(int i=8;i<16;i++){
            obstacle.add(new Node(37,i));
        }
        for(int i=29;i<38;i++){
            obstacle.add(new Node(i,17));
        }

        for(int i=23;i<31;i++){
            obstacle.add(new Node(2,i));
        }
        for(int i=23;i<31;i++){
            obstacle.add(new Node(10,i));
        }
        for(int i=2;i<11;i++){
            obstacle.add(new Node(i,21));
        }

        for(int i=23;i<31;i++){
            obstacle.add(new Node(29,i));
        }
        for(int i=23;i<31;i++){
            obstacle.add(new Node(37,i));
        }
        for(int i=29;i<38;i++){
            obstacle.add(new Node(i,21));
        }

        for(int i=13;i<16;i++){
            obstacle.add(new Node(i,19));
        }
        obstacle.add(new Node(14,18));
        obstacle.add(new Node(14,20));

        for(int i=24;i<27;i++){
            obstacle.add(new Node(i,19));
        }
        obstacle.add(new Node(25,18));
        obstacle.add(new Node(25,20));

        obstacle.add(new Node(12,10));
        obstacle.add(new Node(27,10));
        obstacle.add(new Node(12,28));
        obstacle.add(new Node(27,28));
    }

    public LinkedList<Node> getObstacle() {
        return obstacle;
    }

    public void setObstacle(LinkedList<Node> obstacle) {
        this.obstacle = obstacle;
    }
}
