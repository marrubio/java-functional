package es.marugi.learn.functional.v5flow.impl;

import es.marugi.learn.functional.v5flow.interfaces.Predicate;

public class LenghtPredicate implements Predicate<String> {
    @Override
    public boolean test(String brand) {
        return (brand.length()>4);
    }
}
