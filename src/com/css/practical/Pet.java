package com.css.practical;

public class Pet {
    String name,breed,type;

    public Pet(String name, String breed, String type) {
        this.name = name;
        this.breed = breed;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
