package es.marugi.learn.functional.v4generics;

import es.marugi.learn.functional.v4generics.impl.*;

import java.util.List;

public class Test {

    public static void main(String[] args){

        System.out.println("Start v4generics.Test()");

        // Supply List
        List<String> brandList = MyFunctions.supplyList(new CarProducer());
        System.out.println(brandList);

        // Filter list
        List<String> filteredList = MyFunctions.filterList(brandList,new LenghtPredicate());
        System.out.println(filteredList);

        // Transform list
        List<String> transformedList = MyFunctions.transformList(filteredList, new UpperOperator());
        System.out.println(transformedList);

        // Print list
        MyFunctions.consumeList(transformedList, new PrintConsumer());

        // Reduce list
        Integer length = MyFunctions.reduceList(transformedList, new LengthFunction());
        System.out.println("Total Length:" + length );

    }


}
