package com.an7one.example.effectivejava.ch05generics.item28.example.variant;

import com.an7one.example.effectivejava.ch05generics.item28.example.variant.model.Animal;
import com.an7one.example.effectivejava.util.Constant;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class AnimalShelter {

    Animal getAnimalDAdoption() {
        return new Animal();
    }

    void putAnimal(Animal animal) {

    }
}
