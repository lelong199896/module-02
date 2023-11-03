package FactoryMethod;

public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal animal = factoryAnimal.getAnimal("feline");
        System.out.println("animal sound: " + animal.makeSound());

        Animal animal1 = factoryAnimal.getAnimal("canine");
        System.out.println("aniaml1 sound: " + animal1.makeSound());
    }
}
