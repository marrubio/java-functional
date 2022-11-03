package es.marugi.learn.functional.v5flow;

import es.marugi.learn.functional.v5flow.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class MyListFlow<T> {

    private final List<T> list;

    public MyListFlow(List<T> list){
        this.list = list;
    }

    public MyListFlow<T> supply(Producer<T> supplier) {
        return new MyListFlow<>(supplier.get());
    }

    public MyListFlow<T> filterList(Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for(T item : list){
            if(predicate.test(item)) result.add(item);
        }
        return new MyListFlow<T>(result);
    }

    public MyListFlow<T> transformList(UnaryOperator<T> transform) {
        return new MyListFlow<>(transform.apply(list));
    }


    public MyListFlow<T> printList(Consumer<T> consumer) {
        consumer.accept(list);
        return new MyListFlow<>(list);
    }

    public Integer reduceList(Function<T,Integer> function) {
        return function.apply(list);
    }

}
