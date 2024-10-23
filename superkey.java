class Animal { // Superclass (parent)
 String name="hi there";
  public void animalSound() {
     
    System.out.println("The animal makes a sound");
  }
}
class Dog extends Animal { // Subclass (child)
  public void animalSound() {
    super.animalSound();
    System.out.println(super.name);// Call the superclass method
    System.out.println("The dog says: bow wow");
  }
}
public class Main {
  public static void main(String args[]) {
  Dog myDog = new Dog(); // Create a Dog object
    myDog.animalSound(); // Call the method on the Dog object
  }
}
