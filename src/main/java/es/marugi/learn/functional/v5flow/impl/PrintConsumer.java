package es.marugi.learn.functional.v5flow.impl;

import es.marugi.learn.functional.v5flow.interfaces.Consumer;

import java.util.List;

public class PrintConsumer implements Consumer<String> {
    @Override
    public void accept(List<String> list) {
        for(String item : list){
            System.out.println(item);
        }
    }
}
