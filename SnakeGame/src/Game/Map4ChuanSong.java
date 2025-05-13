package Game;

import java.util.LinkedList;

public class Map4ChuanSong {
    private LinkedList<Node> door;

    public Map4ChuanSong(){
        initMap4Chuangsong();
    }

    private void initMap4Chuangsong(){
        //创建集合
        door=new LinkedList<>();
        door.add(new Node(9,30));
        door.add(new Node(30,30));
        door.add(new Node(9,10));
        door.add(new Node(30,10));

        door.add(new Node(5,18));
        door.add(new Node(5,20));
        door.add(new Node(34,18));
        door.add(new Node(34,20));
    }

    public LinkedList<Node> getDoor() {
        return door;
    }

    public void setDoor(LinkedList<Node> door) {
        this.door = door;
    }
}
