package es.marugi.learn.functional.v5flow.interfaces;

import java.util.List;

public interface Producer<T> {

  List<T> get();

}
