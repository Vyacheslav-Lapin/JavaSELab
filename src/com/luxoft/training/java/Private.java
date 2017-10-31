package com.luxoft.training.java;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Будете переходить на 9-ку - уберите собаку
 * (+ уменьшите регистр первой буквы)!
 */
@Target(METHOD)
@Retention(SOURCE)
public @interface Private {
}
