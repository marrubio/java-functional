package es.marugi.learn.functional.v9reference;


import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class MyListFlow {

    private final List<String> list;

    public MyListFlow(List<String> list){
        this.list = list;
    }

    public MyListFlow supply(Supplier<List<String>> supplier) {
        return new MyListFlow(supplier.get());
    }

    public MyListFlow filterList(Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        for(String item : list){
            if(predicate.test(item)) result.add(item);
        }
        return new MyListFlow(result);
    }

    public MyListFlow transformList(UnaryOperator<List<String>> transform) {

        return new MyListFlow(transform.apply(list));
    }


    public MyListFlow printList(Consumer<List<String>> consumer) {
        consumer.accept(list);
        return new MyListFlow(list);
    }

    public Integer reduceList(Function<List<String>,Integer> function) {

        return function.apply(list);
    }


    public int sumLengthBrands(List<String> brandsList){
        int brandsLength = 0;
        for(String brand : brandsList){
            brandsLength +=  brand.length();
        }
        return brandsLength;
    }

}
