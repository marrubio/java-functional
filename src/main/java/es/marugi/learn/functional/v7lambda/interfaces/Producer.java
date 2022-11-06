package es.marugi.learn.functional.v7lambda.interfaces;

import java.util.List;

@FunctionalInterface
public interface Producer<T> {

  List<T> get();

}
