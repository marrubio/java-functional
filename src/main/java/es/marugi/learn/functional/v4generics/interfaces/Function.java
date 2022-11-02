package es.marugi.learn.functional.v4generics.interfaces;

import java.util.List;

public interface Function<T,R> {
    R apply(T param);
}
