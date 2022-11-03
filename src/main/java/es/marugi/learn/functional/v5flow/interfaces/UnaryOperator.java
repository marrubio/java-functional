package es.marugi.learn.functional.v5flow.interfaces;

import java.util.List;

public interface UnaryOperator<T> {
    List<T> apply(List<T> param);
}
