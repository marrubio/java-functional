package es.marugi.learn.functional.v8util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public class Test {

    public static void main(String[] args){

        System.out.println("Start v8util.main()");
        //https://www.w3schools.com/java/java_lambda.asp

        MyListFlow listFlow = new MyListFlow(new ArrayList<>());

        Supplier<List> carProducer = () -> Arrays.asList("Audi","Bugatti","Peugeot","Renault","Mercedes","Ford","Ferrari","Maserati");
        Predicate<String> lengthPredicate = n -> n.length()>4;
        Consumer<List> printConsumer = n -> System.out.println(n);
        UnaryOperator<List> upperOperator = n -> {
            List<String> result = new ArrayList<>();
            for(Object brand :  n){
                result.add(((String) brand).toUpperCase(Locale.ROOT));
            }
            return result;
        };



        Integer length = listFlow.supply(carProducer)
                .filterList(lengthPredicate)
                .transformList(upperOperator)
                .printList(printConsumer)
                .reduceList( n -> {
                    Integer brandsLength = 0;
                    for(Object brand : n){
                        brandsLength += ((String) brand).length();
                    }
                    return brandsLength;
                });

        System.out.println("Total Length:" + length );

    }


}
