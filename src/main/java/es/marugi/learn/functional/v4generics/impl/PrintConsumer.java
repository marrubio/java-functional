package es.marugi.learn.functional.v4generics.impl;

import es.marugi.learn.functional.v4generics.interfaces.Consumer;

import java.util.List;

public class PrintConsumer implements Consumer<List<String>> {
    @Override
    public void accept(List<String> list) {
        for(String item : list){
            System.out.println(item);
        }
    }
}
