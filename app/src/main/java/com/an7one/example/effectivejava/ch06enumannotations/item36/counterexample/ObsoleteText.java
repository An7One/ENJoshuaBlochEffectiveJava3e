package com.an7one.example.effectivejava.ch06enumannotations.item36.counterexample;

import com.an7one.example.effectivejava.util.Constant;

/**
 * Bit field enumeration constants - OBSOLETE
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
public class ObsoleteText {
    public static final int STYLE_BOLD = 1 << 0;
    public static final int STYLE_ITALIC = 1 << 1;
    public static final int STYLE_UNDERLINE = 1 << 2;
    public static final int STYLE_STRIKETHROUGH = 1 << 3;

    // Parameter is bitwise or of zero or more STYLE_ constants
    public void applyStyles(int styles) {
    }
}
