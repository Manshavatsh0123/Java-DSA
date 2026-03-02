package TCSNQT;

import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100); 
        hm.put("Amarica", 130);
        hm.put("Canda", 160);
        hm.put("Sudan", 210);
        hm.put("Lundon", 190);

        System.out.println(hm);

        System.out.println("Population :" + hm.get("India"));

        System.out.println("Containkey:" + hm.containsKey("India"));

        System.out.println("Remove:" + hm.remove("India"));
        System.out.println(hm);

        System.out.println("Size :" + hm.size());

        System.out.println("Empty :" + hm.isEmpty());

        hm.clear();
        System.out.println(hm);

        System.out.println("Empty :" + hm.isEmpty());

    }
}

// {Canda=160, Sudan=210, Lundon=190, Amarica=130, India=100}
// Population :100
// Containkey:true
// Remove:100
// {Canda=160, Sudan=210, Lundon=190, Amarica=130}
// Size :4
// Empty :false
// {}
// Empty :true