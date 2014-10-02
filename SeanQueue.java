import java.util.List;
import java.util.ArrayList;

public class SeanQueue <T> {
    private List<T> queue = new ArrayList<T>();
    private String type = "";

    public SeanQueue(){

    }

    public void enqueue(T toAdd){
        queue.add(toAdd);
    }

    public T dequeue(){
        T out = queue.get(0);
        queue.remove(0);
        return out;
    }

    public Boolean isEmpty(){
        Boolean output;
        if(queue.size() > 0) {
            output = false;
        } else {
            output = true;
        }
        return output;
    }

    public int size(){
        return queue.size();
    }
}