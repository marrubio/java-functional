package es.marugi.learn.functional.v7lambda.interfaces;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T param);
}
