package es.marugi.learn.functional.v5flow.impl;

import es.marugi.learn.functional.v5flow.interfaces.Producer;

import java.util.Arrays;
import java.util.List;

public class CarProducer implements Producer<String> {
    @Override
    public List<String> get() {
        return Arrays.asList("Audi","Bugatti","Peugeot","Renault","Mercedes","Ford","Ferrari","Maserati");
    }
}
