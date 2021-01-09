import java.util.ArrayList;
        
public class TodoList {
    
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        
        for (String items: list){
            int index = list.indexOf(items) + 1;
            System.out.println(index + ": " + items);
        }
    }
    
    public void remove(int number){
        list.remove(number-1);
    }
    
    
}

