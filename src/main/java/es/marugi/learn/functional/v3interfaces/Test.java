package es.marugi.learn.functional.v3interfaces;

import es.marugi.learn.functional.v3interfaces.impl.CarProducer;
import es.marugi.learn.functional.v3interfaces.impl.LenghtPredicate;
import es.marugi.learn.functional.v3interfaces.impl.PrintConsumer;
import es.marugi.learn.functional.v3interfaces.impl.UpperFunction;

import java.util.List;

public class Test {

    public static void main(String[] args){

        System.out.println("Start v2refactor.Test()");

        // Supply List
        List<String> brandList = MyFunctions.supplyList(new CarProducer());
        System.out.println(brandList);

        //Filter list
        List<String> filteredList = MyFunctions.filterList(brandList,new LenghtPredicate());
        System.out.println(filteredList);

        //Transform list
        List<String> transformedList = MyFunctions.transformList(filteredList, new UpperFunction());
        System.out.println(transformedList);

        //Print list
        MyFunctions.consumeList(transformedList, new PrintConsumer());

        //Reduce list
        Integer length = MyFunctions.reduceList(transformedList);
        System.out.println("Total Length:" + length );

    }


}
