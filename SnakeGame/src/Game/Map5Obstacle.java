package Game;

import java.util.LinkedList;

public class Map5Obstacle {
    private LinkedList<Node> obstacle;

    public Map5Obstacle(){
        initMap5Obstacle();
    }

    private void initMap5Obstacle() {
        //创建集合
        obstacle=new LinkedList<>();
        for (int i=0;i<8;i++){
            obstacle.add(new Node(i,18));
        }
        for (int i=13;i<28;i++){
            obstacle.add(new Node(i,18));
        }
        for (int i=33;i<40;i++){
            obstacle.add(new Node(i,18));
        }

        for(int i=5;i<15;i++){
            obstacle.add(new Node(i,9));
        }

        for(int i=25;i<35;i++){
            obstacle.add(new Node(i,9));
        }

        for(int i=9;i<18;i++){
            obstacle.add(new Node(5,i));
        }
        for(int i=9;i<18;i++){
            obstacle.add(new Node(15,i));
        }
        for(int i=9;i<18;i++){
            obstacle.add(new Node(25,i));
        }
        for(int i=9;i<18;i++){
            obstacle.add(new Node(35,i));
        }

        for(int i=0;i<40;i+=3){
            obstacle.add(new Node(i,21));
        }

        for(int i=1;i<40;i+=3){
            obstacle.add(new Node(i,24));
        }

        for(int i=0;i<40;i+=3){
            obstacle.add(new Node(i,27));
        }

        for(int i=1;i<40;i+=3){
            obstacle.add(new Node(i,30));
        }

        for(int i=0;i<40;i+=3){
            obstacle.add(new Node(i,33));
        }

        for(int i=1;i<40;i+=3){
            obstacle.add(new Node(i,36));
        }
    }

    public LinkedList<Node> getObstacle() {
        return obstacle;
    }

    public void setObstacle(LinkedList<Node> obstacle) {
        this.obstacle = obstacle;
    }
}