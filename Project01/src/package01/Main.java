package package01;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> maps=new HashMap<>();
        maps.put("Mika",10.0);
        maps.put("Janja",9.8);
        maps.put("Joka",9.9);

        for(String key : maps.keySet())
            System.out.println(key+": "+maps.get(key));

        Student student=new Student("Janja","Janjic",8.9);
        System.out.println(student);
    }
}
