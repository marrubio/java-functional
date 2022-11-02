package es.marugi.learn.functional.v3interfaces.impl;

import es.marugi.learn.functional.v3interfaces.interfaces.Function;

import java.util.List;

public class LengthFunction implements Function {
    @Override
    public Integer apply(List<String> list) {
        Integer length = 0;
        for(String brand : list){
            length += brand.length();
        }
        return length;
    }
}
