package com.an7one.example.effectivejava.ch05generics.item33.example;

import com.an7one.example.effectivejava.util.Constant;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Typesafe heterogeneous container pattern - implementation
@SuppressWarnings(Constant.WARNING.UNUSED)
public class Favorites {
    // <?> means every key can have a different parameterized type
    private final Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
