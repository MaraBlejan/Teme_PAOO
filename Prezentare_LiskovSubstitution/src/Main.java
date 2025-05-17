public class Main {
    public static void makeAnimalSound(Animal animal)
    {
        animal.makeSound();
    }
    public static void main(String []args)
    {
        Animal dog=new Dog();
        Animal cat= new Cat();
        Animal duck=new Duck();
        makeAnimalSound(dog);
        makeAnimalSound(cat);
        makeAnimalSound(duck);
    }
}
