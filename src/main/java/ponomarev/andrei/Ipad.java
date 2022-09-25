package ponomarev.andrei;

import java.util.ArrayList;

public class Ipad {

    ArrayList<String> ipad = new ArrayList<>();

    public void addIpad(String ipad){
        if(!this.ipad.contains(ipad)) {
            this.ipad.add(ipad);
        }
    }

    public void removeIpad(String name){
        ipad.remove(name);
    }

    public void removeAllIpad(){
        while(!ipad.isEmpty()){
            ipad.removeAll(ipad);
        }
    }

    public void printAllIpad(){
        for(String ipad : ipad){
            System.out.println("Айпад: " + ipad);
        }
    }
}
