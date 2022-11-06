package es.marugi.learn.functional.v7lambda.interfaces;

import java.util.List;

@FunctionalInterface
public interface Function<T,R> {
    R apply(List<T> param);
}
