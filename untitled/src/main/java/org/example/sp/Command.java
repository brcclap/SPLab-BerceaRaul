package org.example.sp;

public interface Command<T> {
    T execute();
}