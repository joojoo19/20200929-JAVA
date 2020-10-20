package chap10.textbook.s100204;

public class ClassCastEceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		// if(animal instanceof Dog) {
		  Dog dog = (Dog) animal; // classCastException발생 가능
	    // }
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
