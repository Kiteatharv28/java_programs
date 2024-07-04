class Animal{

	void makeSound(){

		System.out.println("MAKES A SOUND");
	}
}
class Cat extends Animal{

	void makeSound(){

		System.out.println("Cat meow");
	}
}
class Dog extends Animal{

	void makeSound(){

		System.out.println("Dog barks");
	}
}
class Demo{

	public static void main(String [] args){

		Cat obj=new Cat();
		obj.makeSound();

		Dog obj1=new Dog();
		obj1.makeSound();
	}
}


