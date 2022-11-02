package es.marugi.learn.functional.v4generics;

import es.marugi.learn.functional.v4generics.impl.LengthFunction;
import es.marugi.learn.functional.v4generics.impl.PrintConsumer;
import es.marugi.learn.functional.v4generics.impl.UpperOperator;
import es.marugi.learn.functional.v4generics.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class MyFunctions {

    public static List<String> supplyList(Producer<List> supplier) {
        return supplier.get();
    }


    public static List<String> filterList(List<String> brandList, Predicate predicate) {
        List<String> result = new ArrayList<>();
        for(String brand : brandList){
            if(predicate.test(brand)) result.add(brand);
        }
        return result;
    }

    public static List<String> transformList(List<String> list, UpperOperator transform) {
        return transform.apply(list);
    }


    public static void consumeList(List<String> list, PrintConsumer consumer) {
        consumer.accept(list);
    }

    public static Integer reduceList(List<String> transformedList, LengthFunction function) {
        return function.apply(transformedList);
    }

}
