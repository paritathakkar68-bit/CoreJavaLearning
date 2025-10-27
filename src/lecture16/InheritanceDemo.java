package lecture16;

// Main class to test the functionality
public class InheritanceDemo
{
    public static void main(String[] args)
    {
        // Creating a Parent class object
        Animal parentAnimal = new Animal();
        System.out.println("Calling methods using Parent object:");
        parentAnimal.speak();  // Animal version
        parentAnimal.eat();    // Only Parent methods accessible

        // Creating a Child class object
        Dog childDog = new Dog();
        System.out.println("\nCalling methods using Child object:");
        childDog.speak();      // Overridden method
        childDog.eat();        // Inherited from Parent
        childDog.wagTail();    // Child-specific method

        // Creating Parent reference to Child object (Polymorphism)
        Animal polymorphicAnimal = new Dog();
        System.out.println("\nCalling methods using Parent reference to Child object:");
        polymorphicAnimal.speak();  // Dog version due to overriding
        polymorphicAnimal.eat();    // Parent method
        // polymorphicAnimal.wagTail(); //  Not allowed, method not in Animal
    }
}
