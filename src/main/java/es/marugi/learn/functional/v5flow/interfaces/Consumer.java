package es.marugi.learn.functional.v5flow.interfaces;

import java.util.List;

public interface Consumer<T> {
    void accept(List<T> param);
}
