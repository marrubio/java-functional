package es.marugi.learn.functional.v3interfaces.impl;

import es.marugi.learn.functional.v3interfaces.interfaces.Consumer;

import java.util.List;

public class PrintConsumer implements Consumer {
    @Override
    public void accept(List<String> list) {
        for(String item : list){
            System.out.println(item);
        }
    }
}
