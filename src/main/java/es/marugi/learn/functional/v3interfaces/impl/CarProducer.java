package es.marugi.learn.functional.v3interfaces.impl;

import es.marugi.learn.functional.v3interfaces.interfaces.Producer;

import java.util.Arrays;
import java.util.List;

public class CarProducer implements Producer {
    @Override
    public List<String> get() {
        return Arrays.asList("Audi","Bugatti","Peugeot","Renault","Mercedes","Ford","Ferrari","Maserati");
    }
}
