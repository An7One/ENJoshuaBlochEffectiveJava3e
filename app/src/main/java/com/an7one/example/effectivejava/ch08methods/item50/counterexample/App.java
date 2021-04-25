package com.an7one.example.effectivejava.ch08methods.item50.counterexample;

import com.an7one.example.effectivejava.util.Constant;

import java.util.Date;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class App {
    public static void main(String[] args) {
        // to attack the internals of a Period instance
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        // deprecated
        // `Date` is obsolete and should no longer be used in new code
        end.setYear(78);


        Date start1 = new Date();
        Date end1 = new Date();
        PeriodBetter periodBetter = new PeriodBetter(start, end);
        // this modifies the internal of `periodBetter`
        periodBetter.end().setYear(78);
    }
}
