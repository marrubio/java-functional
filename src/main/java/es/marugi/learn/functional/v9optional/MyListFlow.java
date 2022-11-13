package es.marugi.learn.functional.v9optional;


import java.util.*;
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


    public MyListFlow sortList(Comparator<String> comparator) {
        List<String> sortedList = new ArrayList<>(list);
        sortedList.sort(comparator);
        return new MyListFlow(sortedList);
    }

    // The method returns an optional to control nullPointerException
    public Optional<String> max(Comparator<String> comparator) {
        if(list.isEmpty())
            return Optional.empty();
        else
            return Optional.of(Collections.max(list,comparator));
    }

}
