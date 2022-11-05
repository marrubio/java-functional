package es.marugi.learn.functional.v6inline;

import es.marugi.learn.functional.v6inline.interfaces.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Test {

    public static void main(String[] args){

        System.out.println("Start v6inline.Test()");
        MyListFlow<String> listFlow = new MyListFlow<>(new ArrayList<String>());

        Producer<String> carProducer = new Producer(){
            @Override
            public List get() {
                return Arrays.asList("Audi","Bugatti","Peugeot","Renault","Mercedes","Ford","Ferrari","Maserati");
            }
        };

        Predicate<String> lengthPredicate = new Predicate(){
            @Override
            public boolean test(Object param) {
                return (((String)param).length()>4);
            }
        };

        Consumer<String> printConsumer = new Consumer<String>() {
            @Override
            public void accept(List<String> param) {
                for(String item : param){
                    System.out.println(item);
                }
            }
        };

        UnaryOperator<String> upperOperator = new UnaryOperator<String>() {
            @Override
            public List<String> apply(List<String> param) {
                List<String> result = new ArrayList<>();
                for(String brand : param){
                    result.add(brand.toUpperCase(Locale.ROOT));
                }
                return result;
            }
        };

        Integer length = listFlow.supply(carProducer)
                .filterList(lengthPredicate)
                .transformList(upperOperator)
                .printList(printConsumer)
                .reduceList(new Function<String, Integer>(){
                    @Override
                    public Integer apply(List<String> param) {
                        Integer length = 0;
                        for(String brand : param){
                            length += brand.length();
                        }
                        return length;
                    }
                });

        System.out.println("Total Length:" + length );

    }


}
