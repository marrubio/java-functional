package es.marugi.learn.functional.v5flow.impl;

import es.marugi.learn.functional.v5flow.interfaces.UnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UpperOperator implements UnaryOperator<String> {
    @Override
    public List<String> apply(List<String> param) {
        List<String> result = new ArrayList<>();
        for(String brand : param){
            result.add(brand.toUpperCase(Locale.ROOT));
        }
        return result;
    }
}
