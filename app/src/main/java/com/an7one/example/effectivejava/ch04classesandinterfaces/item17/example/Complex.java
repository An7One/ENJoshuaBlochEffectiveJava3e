package com.an7one.example.effectivejava.ch04classesandinterfaces.item17.example;

import com.an7one.example.effectivejava.util.Constant;

/**
 * This pattern is known as the functional approach,
 *  because methods return the result of applying a function to their operand,
 *  without modifying it.
 *
 *  In Contrast, the procedural or imperative approach in which methods apply a procedure to their operand,
 *  causing its state to change.
 *
 *  Please be noted that the method names are prepositions(such as plus), rather than verbs(such as add).
 *  This emphasizes the fact that methods do not change the value of the objects.
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
class Complex {
    private final double re;
    private final double im;

    Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }


    /**
     * immutable class with static factories instead of constructors
     *  it is flexible because it allows the use of multiple package-private implementation classes
     *
     * @param re the real part
     * @param im the imaginary part
     * @return a new complex number
     */
    public static Complex valueOf(double re, double im){
        return new Complex(re, im);
    }

    public double getRealPart() {
        return re;
    }

    public double getImaginaryPart() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
    }

    public Complex dividedBy(Complex c) {
        double temp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / temp, (im * c.re - re * c.im) / temp);
    }

    @Override
    public boolean equals(Object that) {
        if (that == this) return true;

        if (!(that instanceof Complex))
            return false;

        Complex c = (Complex) that;

        return Double.compare(c.re, re) == 0 && Double.compare(c.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + ")";
    }
}
