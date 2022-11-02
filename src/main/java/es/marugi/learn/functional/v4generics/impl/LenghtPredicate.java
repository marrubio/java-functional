package es.marugi.learn.functional.v4generics.impl;

import es.marugi.learn.functional.v4generics.interfaces.Predicate;

public class LenghtPredicate implements Predicate<String> {
    @Override
    public boolean test(String brand) {
        return (brand.length()>4);
    }
}
