import model.Cat;
import model.Cow;
import model.Dog;
import model.Pig;
import model.Rhino;
import model.Duck;
import model.Mongoose;
import model.Flamingo;
import model.Owl;
import model.Chinchilla;
import model.Horse;

public class AnimalNoise {

	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {

		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		
		Dog doggy = new Dog();
		System.out.println(doggy.speak());
		
		Pig wilbur = new Pig();
		System.out.println(wilbur.speak());

		Cow moomoo = new Cow();
		System.out.println(moomoo.speak());
		
		Duck ducky = new Duck();
		System.out.println(ducky.speak());
		
		Mongoose rikkitikkitavi = new Mongoose();
		System.out.println(rikkitikkitavi.speak());
		
		Flamingo Ricco = new Flamingo();
		System.out.println(Ricco.speak());
		
		Owl mrOwl = new Owl();
		System.out.println(mrOwl.speak());

		Chinchilla bobby = new Chinchilla();
		System.out.println(bobby.speak());
		
		Rhino spike = new Rhino();
		System.out.println(spike.speak());
    
    Horse horse = new Horse();
		System.out.println(horse.speak());
	}
}


