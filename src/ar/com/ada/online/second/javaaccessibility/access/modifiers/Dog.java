package ar.com.ada.online.second.javaaccessibility.access.modifiers;

class Dog {
    String breed;
    String color;

    void showAttributesValues() {
        System.out.println("Breed: " + this.breed);
        System.out.println("Color: " + this.color);
    }
}
