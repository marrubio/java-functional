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

        MyListFlow<String> listFlow = new MyListFlow<>(new ArrayList<>());

        Supplier<List> carProducer = () -> Arrays.asList("Audi","Bugatti","Peugeot","Renault","Mercedes","Ford","Ferrari","Maserati");
        Predicate<String> lengthPredicate = n -> n.length()>4;
        Consumer<String> printConsumer = n -> System.out.println(n);
        UnaryOperator<String> upperOperator = n -> {
            List<String> result = new ArrayList<>();
            for(String brand : n){
                result.add(brand.toUpperCase(Locale.ROOT));
            }
            return result;
        };



        Integer length = listFlow.supply(carProducer)
                .filterList(lengthPredicate)
                .transformList(upperOperator)
                .printList(printConsumer)
                .reduceList( n -> {
                    Integer brandsLength = 0;
                    for(String brand : n){
                        brandsLength += brand.length();
                    }
                    return brandsLength;
                });

        System.out.println("Total Length:" + length );

    }


}
