package ponomarev.andrei;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iphone {

    public Set<String> names = new HashSet<>();

    public void addIphone(String iphone) {
        names.add(iphone);
    }

    public void deleteIphone(String name) {
        for (String s : new ArrayList<String>(names)) {
            if (s.equals(name)) names.remove(s);
        }
    }


    public void printIphone(){
        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }

}
