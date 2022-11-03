package es.marugi.learn.functional.v5flow.impl;

import es.marugi.learn.functional.v5flow.interfaces.Function;

import java.util.List;

public class LengthFunction implements Function<String ,Integer> {
    @Override
    public Integer apply(List<String> list) {
        Integer length = 0;
        for(String brand : list){
            length += brand.length();
        }
        return length;
    }
}
