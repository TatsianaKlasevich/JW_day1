package klasevich.tanya.task10.service;

import klasevich.tanya.task10.entity.Function;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Service {
    public Map<Integer,Double> count (int a, int b, int h){
        Map<Integer,Double> map = new TreeMap<>();

        for (int i = a; i <b ; i+=h) {
           double f = Math.tan(a);
            map.put(i, f);
        }

        return map;

    }


}
