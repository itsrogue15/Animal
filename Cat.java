abstract class Animal {
    public abstract void makeSound();
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog says: bark");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat says: meow");
    }
}
class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.makeSound();
        animal2.makeSound();
    }
}
