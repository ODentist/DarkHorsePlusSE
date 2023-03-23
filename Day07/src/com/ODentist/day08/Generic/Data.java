package com.ODentist.day08.Generic;

public interface Data<T> {
    void save(T t);
    T get();
}
