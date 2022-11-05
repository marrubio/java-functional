package es.marugi.learn.functional.v6inline.interfaces;

import java.util.List;

public interface Function<T,R> {
    R apply(List<T> param);
}
