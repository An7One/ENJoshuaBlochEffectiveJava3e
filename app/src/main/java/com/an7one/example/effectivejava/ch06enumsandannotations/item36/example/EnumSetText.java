package com.an7one.example.effectivejava.ch06enumsandannotations.item36.example;

import com.an7one.example.effectivejava.util.Constant;

import java.util.Set;

/**
 * EnumSet - a modern replacement for bit fields
 * <p>
 * just because an enumerated type will be used in sets,
 * there is no reason to represent it with bit fields.
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
public class EnumSetText {
    /**
     * While it seems likely that all clients would pass an EnumSet to the method,
     * it is generally good practice to accept the interface type rather than the implmenetation type.
     */
    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    // Any Set could be passed in, but EnumSet is clearly the best
    public void applyStyles(Set<Style> styles) {

    }
}
