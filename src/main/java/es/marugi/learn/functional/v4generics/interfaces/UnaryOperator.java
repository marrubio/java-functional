package es.marugi.learn.functional.v4generics.interfaces;

import java.util.List;

public interface UnaryOperator<T> {
    T apply(T param);
}
