package es.marugi.learn.functional.v5flow;

import es.marugi.learn.functional.v5flow.impl.*;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        System.out.println("Start v5flow.Test()");
        MyListFlow<String> listFlow = new MyListFlow<>(new ArrayList<String>());
        Integer length = listFlow.supply(new CarProducer())
                .filterList(new LenghtPredicate())
                .transformList(new UpperOperator())
                .printList(new PrintConsumer())
                .reduceList(new LengthFunction());

        System.out.println("Total Length:" + length );

    }


}
