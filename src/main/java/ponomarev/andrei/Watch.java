package ponomarev.andrei;

import java.util.HashMap;
import java.util.Map;

public class Watch {

    Map<String, String> watch = new HashMap<>();

    public void addWatch(String name,String diameter){
        watch.put(name,diameter);
    }

    public void removeWatch(String name){
        watch.remove(name);
    }

    public void printAllWatch(){
        for(Map.Entry<String,String> entry : watch.entrySet()){
            System.out.println("Модель: " + entry.getKey() + ", Диаметр: " + entry.getValue());
        }
    }

    public boolean hasWatch(String name, String diametr){
        for(Map.Entry<String,String> entry : watch.entrySet()) {
            if(entry.getKey().equals(name) && entry.getValue().equals(diametr)){
                return true;
            }
        }
        return false;
    }
}
