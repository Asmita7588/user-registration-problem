package org.example;


public interface Validator<T> {
    boolean validate(T value);
}
