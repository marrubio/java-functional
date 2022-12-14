package es.marugi.learn.functional.v3interfaces.impl;

import es.marugi.learn.functional.v3interfaces.interfaces.UnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UpperOperator implements UnaryOperator {
    @Override
    public List<String> apply(List<String> list) {
        List<String> result = new ArrayList<>();
        for(String brand : list){
            result.add(brand.toUpperCase(Locale.ROOT));
        }
        return result;
    }
}
