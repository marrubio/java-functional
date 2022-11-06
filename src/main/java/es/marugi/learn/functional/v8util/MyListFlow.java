package es.marugi.learn.functional.v8util;


import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class MyListFlow<T> {

    private final List<T> list;

    public MyListFlow(List<T> list){
        this.list = list;
    }

    public MyListFlow<T> supply(Supplier<> supplier) {
        return new MyListFlow<List>(supplier.get());
    }

    public MyListFlow<T> filterList(Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for(T item : list){
            if(predicate.test(item)) result.add(item);
        }
        return new MyListFlow<T>(result);
    }

    public MyListFlow<T> transformList(UnaryOperator<T> transform) {

        return new MyListFlow<T>(transform.apply(list));
    }


    public MyListFlow<T> printList(Consumer<T> consumer) {
        consumer.accept(list);
        return new MyListFlow<>(list);
    }

    public Integer reduceList(Function<List,Integer> function) {
        return function.apply(list);
    }

}
