package com.an7one.example.effectivejava.ch05generics.item33.example;

import com.an7one.example.effectivejava.util.Constant;
import jdk.jfr.AnnotationElement;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Typesafe heterogeneous container pattern - implementation
 * <p>
 * 1. typesafe
 * 2. heterogeneous
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
public class Favorites {
    /**
     * <?> means every key can have a different parameterized type
     * <p>
     * Since the values are all of `Object` type,
     * the `Map` does not guarantee the type relationship between keys and values
     */
    private final Map<Class<?>, Object> favorites = new HashMap<>();

    /**
     * not type safe enough for the very generic `Class` itself (item 26)
     * e.g.
     * putFavorite(Class, couldBeAnything);
     *
     * @param type
     * @param instance
     * @param <T>
     */
    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), instance);
    }

    // to achieve runtime type safety with a dynamic cast
    public <T> void putFavoriteWithTypeSafety(Class<T> type, T instance) {
        favorites.put(type, type.cast(instance));
    }

    /**
     * to dynamically cast the object reference to the type represented by the `Class` object.
     * <p>
     * it returns the argument, otherwise it throws a `ClassCastException`.
     *
     * @param type
     * @param <T>
     * @return
     */
    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }

    /**
     * Use of `asSubclass` to safely cast to a bounded type token
     *
     * @param element
     * @param annotationTypeName
     * @return
     */
    static Annotation getAnnotation(AnnotationElement element,
                                    String annotationTypeName) {
        Class<?> annotationType = null; // Unbounded type token

        try {
            annotationType = Class.forName(annotationTypeName);
        } catch (Exception ex) {
            throw new IllegalArgumentException(ex);
        }

        return element.getAnnotation(annotationType.asSubclass(Annotation.class));
    }
}
