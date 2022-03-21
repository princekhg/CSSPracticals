package com.css.practical;

import java.io.Serializable;

public class Person implements Serializable {
    Pet[] pets;

    public Person(Pet[] pets) {
        setPets(pets);
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }
}
