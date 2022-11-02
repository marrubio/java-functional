package es.marugi.learn.functional.v4generics.impl;

import es.marugi.learn.functional.v4generics.interfaces.Function;

import java.util.List;

public class LengthFunction implements Function<List<String> ,Integer> {
    @Override
    public Integer apply(List<String> list) {
        Integer length = 0;
        for(String brand : list){
            length += brand.length();
        }
        return length;
    }
}
