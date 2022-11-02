package es.marugi.learn.functional.v3interfaces;

import es.marugi.learn.functional.v3interfaces.interfaces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MyFunctions {

    public static List<String> supplyList(Producer supplier) {
        return supplier.get();
    }


    public static List<String> filterList(List<String> brandList, Predicate predicate) {
        List<String> result = new ArrayList<>();
        for(String brand : brandList){
            if(predicate.test(brand)) result.add(brand);
        }
        return result;
    }

    public static List<String> transformList(List<String> list, UnaryOperator transform) {
        return transform.apply(list);
    }


    public static void consumeList(List<String> list, Consumer consumer) {
        consumer.accept(list);
    }

    public static Integer reduceList(List<String> transformedList, Function function) {
        return function.apply(transformedList);
    }

}
