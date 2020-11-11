package klasevich.tanya.task10.view;

import java.util.Map;

public class View {
    public void print(Map<Integer, Double> map){
        System.out.println("x       F(x)");
        for (Map.Entry entry: map.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
