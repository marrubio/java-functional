package es.marugi.learn.functional.v7lambda.interfaces;

import java.util.List;

@FunctionalInterface
public interface Consumer<T> {
    void accept(List<T> param);
}
