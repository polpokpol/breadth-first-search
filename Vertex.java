import java.util.ArrayList;
import java.util.List;

public class Vertex{
    
    private int data;
    private boolean visited;
    private List<Vertex> neighborList;

    public Vertex(int data) {
        this.setData(data);
        this.setNeighborList(new ArrayList<>());
    }

    public List<Vertex> getNeighborList() {
        return neighborList;
    }

    public void setNeighborList(List<Vertex> neighborList) {
        this.neighborList = neighborList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void addNeighborVertex(Vertex vertex){
        this.neighborList.add(vertex); // append
    }

    @Override
    public String toString(){
        return ""+this.data;
    }
}