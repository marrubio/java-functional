package es.marugi.learn.functional.v4generics.impl;

import es.marugi.learn.functional.v4generics.interfaces.UnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UpperOperator implements UnaryOperator<List<String>> {
    @Override
    public List<String> apply(List<String> param) {
        List<String> result = new ArrayList<>();
        for(String brand : param){
            result.add(brand.toUpperCase(Locale.ROOT));
        }
        return result;
    }
}
