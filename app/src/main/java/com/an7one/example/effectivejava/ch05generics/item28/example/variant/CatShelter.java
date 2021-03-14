/**
 * Reference:
 *  https://en.wikipedia.org/wiki/Covariance_and_contravariance_(computer_science)
 */
package com.an7one.example.effectivejava.ch05generics.item28.example.variant;

import com.an7one.example.effectivejava.ch05generics.item28.example.variant.model.Animal;
import com.an7one.example.effectivejava.ch05generics.item28.example.variant.model.Cat;
import com.an7one.example.effectivejava.util.Constant;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class CatShelter extends Animal {
    /**
     * convariant method return type
     *
     * Computer languages that support covariant return type:
     *  Java
     *  C++
     *  Scala
     *  D
     *  etc.
     *
     * Computer languages that does NOT support covariant return type:
     *  C#
     *
     * @return
     */
    public Cat getAnimalForAdoption() {
        return new Cat();
    }

    /**
     * contravariant method parameter type
     * this is type-safe
     *
     * Computer languages taht support contravariant parameter type
     *  Java
     *  C++
     *  Sather
     *
     * @param animal
     */
    public void putAnimal(Object animal){

    }
}
