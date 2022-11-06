package es.marugi.learn.functional.v7lambda.interfaces;

import java.util.List;

@FunctionalInterface
public interface UnaryOperator<T> {
    List<T> apply(List<T> param);
}
