package es.marugi.learn.functional.v3interfaces.impl;

import es.marugi.learn.functional.v3interfaces.interfaces.Predicate;

import java.util.List;

public class LenghtPredicate implements Predicate {
    @Override
    public boolean test(String brand) {
        return (brand.length()>4);
    }
}
