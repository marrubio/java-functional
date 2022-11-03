package es.marugi.learn.functional.v5flow.interfaces;

import java.util.List;

public interface Function<T,R> {
    R apply(List<T> param);
}
