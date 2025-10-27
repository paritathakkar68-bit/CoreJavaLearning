package lecture16;

// Parent class definition
class Animal
{
    // Method in Parent class
    public void speak()
    {
        System.out.println("Animal makes a sound");
    }

    // Another method in Parent class
    public void eat()
    {
        System.out.println("Animal is eating");
    }
}

// Child class that inherits from Parent class
class Dog extends Animal
{
    // Overriding Parent class method
    @Override
    public void speak()
    {
        System.out.println("Dog barks");
    }

    // Method specific to Child class
    public void wagTail()
    {
        System.out.println("Dog is wagging its tail");
    }
}
