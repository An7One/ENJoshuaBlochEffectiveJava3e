package com.an7one.example.effectivejava.ch08methods.item50.counterexample;

import java.util.Date;

public final class PeriodBetter {
    private final Date start;
    private final Date end;

    public PeriodBetter(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        /*
         * Defensive copies are made before checking the validity of parameters,
         * and the validity check is performed on the copies rather than on the originals
         *
         * item 49
         *
         * time-of-check/time-of-use
         */
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start + " after " + end);
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }
}