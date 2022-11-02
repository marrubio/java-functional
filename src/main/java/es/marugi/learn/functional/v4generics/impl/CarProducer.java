package es.marugi.learn.functional.v4generics.impl;

import es.marugi.learn.functional.v4generics.interfaces.Producer;

import java.util.Arrays;
import java.util.List;

public class CarProducer implements Producer<List> {
    @Override
    public List<String> get() {
        return Arrays.asList("Audi","Bugatti","Peugeot","Renault","Mercedes","Ford","Ferrari","Maserati");
    }
}
